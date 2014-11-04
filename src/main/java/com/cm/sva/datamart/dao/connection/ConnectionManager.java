/*
 * Classname: ConnectionManager
 * Author:    Víctor Hugo De La Rosa Calzada
 * Date:      03/07/2014
 * © Concepto Móvil S.A. de C.V. 2014
 */

package com.cm.sva.datamart.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cm.sva.datamart.dao.config.ConfigurationLoader;


public class ConnectionManager {
    
    public static void releaseResources(ResultSet rs, PreparedStatement ps){
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            
            } catch (SQLException ex) {
            
            }

    }
    public static void closeConnection(Connection conn) throws SQLException{
        if (conn != null) {
            conn.close();
        }
    }
    
            
}
