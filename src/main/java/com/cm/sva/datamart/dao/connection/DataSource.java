package com.cm.sva.datamart.dao.connection;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.cm.sva.datamart.dao.config.ConfigurationLoader;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DataSource {

    private static DataSource     datasource;
    private ComboPooledDataSource cpds;
    private static ConfigurationLoader config= ConfigurationLoader.getInstance();

    private DataSource() throws IOException, SQLException, PropertyVetoException {
        cpds = new ComboPooledDataSource();
        cpds.setDriverClass(config.getDbDriver()); //loads the jdbc driver
        cpds.setJdbcUrl("jdbc:postgresql://"+config.getDbUrl()+":"+config.getDbPort()+"/"+config.getDbName());
        cpds.setUser(config.getDbUser());
        cpds.setPassword(config.getDbPassword());
        cpds.setMinPoolSize(config.getMinPoolSize());
        cpds.setAcquireIncrement(config.getAcquireIncrements());
        cpds.setMaxPoolSize(config.getMaxPoolSize());
        cpds.setMaxStatements(config.getMaxStatement());

    }

    public static DataSource getInstance() throws IOException, SQLException, PropertyVetoException {
        if (datasource == null) {
            datasource = new DataSource();
            return datasource;
        } else {
            return datasource;
        }
    }

    public Connection getConnection() throws SQLException {
        return this.cpds.getConnection();
    }

}
