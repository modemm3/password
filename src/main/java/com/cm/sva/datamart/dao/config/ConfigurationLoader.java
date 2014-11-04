package com.cm.sva.datamart.dao.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class implementing the Singleton Pattern to prevent multiple instances of the same object.
 * This class contains all the configuration parameters of the connector.
 *
 * @author Horacio Oswaldo Ferro Díaz
 * @version 1.0
 */
public final class ConfigurationLoader {
    /** Class Logger. */
    private static final Logger LOG = LoggerFactory.getLogger(ConfigurationLoader.class);
    /** Configuration properties. */
    private Properties props = null;
    /** Singleton Instance. */
    private static ConfigurationLoader instance;

    /**
     * User to connect DB
     */
    private String dbUser;
    /**
     * Password to DB
     */
    private String dbPassword;
    /**
     * Host to DB
     */
    private String dbUrl;
    /**
     * Post to connect DB
     */
    private String dbPort;
    /**
     * name database
     */
    private String dbName;
    /**
     * Driver Database
     */
    private String dbDriver;
    
    /**
     * DB_MIN_POOL_SIZE
     */
    private int minPoolSize=5;
    /**
     * DB_MAX_POOL_SIZE
     */
    private int maxPoolSize=20;
    /**
     * DB_MAX_STATEMENT
     */
    private int maxStatement=180;
    /**
     * DB_ACQUIREINCREMENT
     */
    private int acquireIncrements=5;
    
    /**
     * Private constructor to ensure only an instance exists.
     */
    private ConfigurationLoader() {
        try {
            LOG.info("Loading configuration.");
            props = new Properties();
            final File config = new File("config.properties");
            if (config.exists()) {
                final FileInputStream in = new FileInputStream(config);
                props.load(in);
                in.close();
            } else {
                props.load(ConfigurationLoader.class.getResourceAsStream("/config.properties"));
            }
        } catch (Exception ex) {
            LOG.error(ex.getMessage(), ex);
        }
        dbUser = props.getProperty("com.cm.datamart.DB_USER");
        dbPassword = props.getProperty("com.cm.datamart.DB_PASSWORD");
        dbUrl = props.getProperty("com.cm.datamart.DB_URL");
        dbPort = props.getProperty("com.cm.datamart.DB_PORT");
        dbName = props.getProperty("com.cm.datamart.DB_NAME");
        dbDriver = props.getProperty("com.cm.datamart.DB_DRIVER");


        try{
        	minPoolSize =Integer.parseInt(props.getProperty("com.cm.datamart.DB_MIN_POOL_SIZE"));
        }
        catch(NumberFormatException ex){
        	LOG.error("Error to get minPoolsize");
        }
        try{
        	maxPoolSize =Integer.parseInt(props.getProperty("com.cm.datamart.DB_MAX_POOL_SIZE"));
        }
        catch(NumberFormatException ex){
        	LOG.error("Error to get maxPoolsize");
        }
        try{
        	maxStatement =Integer.parseInt(props.getProperty("com.cm.datamart.DB_MAX_STATEMENT"));
        }
        catch(NumberFormatException ex){
        	LOG.error("Error to get maxStatement");
        }
        try{
        	acquireIncrements =Integer.parseInt(props.getProperty("com.cm.datamart.DB_ACQUIREINCREMENT"));
        }
        catch(NumberFormatException ex){
        	LOG.error("Error to get acquireIncrements");
        }
        LOG.info("Configuration loaded.");
    }

    /**
     * Get the singleton instance.
     * @return instance of ConfigurationLoader.
     */
    public static ConfigurationLoader getInstance() {
        if (instance == null) { // Let the VM handle the unused instances.
            instance = new ConfigurationLoader();
        }
        return instance;
    }

    /**
     * Getter for configurations.
     * @param configName name of the configuration.
     * @return the value of the configuration.
     */
    public String getConfiguration(final String configName) {
        return props.getProperty(configName);
    }
    /**
     * get username to connect db
     * @return username
     */
	public String getDbUser() {
		return dbUser;
	}
	/**
	 * get Password to connect db
	 * @return password
	 */
	public String getDbPassword() {
		return dbPassword;
	}
	/**
	 * get Host to connect db
	 * @return host
	 */

	public String getDbUrl() {
		return dbUrl;
	}
	/**
	 * get Port to connect db
	 * @return port
	 */
	public String getDbPort() {
		return dbPort;
	}
	/**
	 * get name database
	 * @return name database
	 */
	public String getDbName() {
		return dbName;
	}
	/**
	 * get driver to connect db
	 * @return driver
	 */
	public String getDbDriver() {
		return dbDriver;
	}

	public int getMinPoolSize() {
		return minPoolSize;
	}

	public int getMaxPoolSize() {
		return maxPoolSize;
	}

	public int getMaxStatement() {
		return maxStatement;
	}

	public int getAcquireIncrements() {
		return acquireIncrements;
	}

}
