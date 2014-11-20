package com.cm.sva.datamart.dao;

import com.cm.sva.datamart.dao.connection.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cm.sva.datamart.dao.connection.DataSource;
import com.cm.sva.datamart.dto.UserDTO;

public class UserDAO {

	public UserDTO getUser(UserDTO user) throws Exception{
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
		UserDTO userDTO=null;
		try{
				conn=DataSource.getInstance().getConnection();
				pst=conn.prepareStatement("select fiid,fvcname,fvcpassword from users where fvcpassword=?");
				pst.setString(1, user.getPassword());
				result=pst.executeQuery();
				while(result.next()){
					userDTO= new UserDTO();
					userDTO.setId(result.getInt("fiid"));
					userDTO.setUserName(result.getString("fvcname"));
					userDTO.setPassword(result.getString("fvcpassword"));
				}
		}
		catch(Exception ex){
			throw new Exception("Error ",ex);
		}
                finally{
                    ConnectionManager.releaseResources(result, pst);
                    ConnectionManager.closeConnection(conn);
                }
                
		return userDTO;
	}
}
