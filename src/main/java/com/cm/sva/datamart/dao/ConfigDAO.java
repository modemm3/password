package com.cm.sva.datamart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cm.sva.datamart.dao.connection.DataSource;
import com.cm.sva.datamart.dto.ConfigDTO;

public class ConfigDAO {

	public List<ConfigDTO> getListConfig(Integer length) throws Exception{
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
		ConfigDTO configDTO=null;
		List<ConfigDTO> listConfigDTO=new ArrayList<ConfigDTO>();
		try{
				conn=DataSource.getInstance().getConnection();
				pst=conn.prepareStatement("select fvid,fvcname,fvcdescription,fbsecret,image from config where length(fvid)=?");
				pst.setInt(1, length);
				result=pst.executeQuery();
				while(result.next()){
					configDTO= new ConfigDTO();
					configDTO.setId(result.getString("fvid"));
					configDTO.setName(result.getString("fvcname"));
					configDTO.setDescription(result.getString("fvcdescription"));
					configDTO.setSecret(result.getBoolean("fbsecret"));
                                        configDTO.setImage(result.getString("image"));
					listConfigDTO.add(configDTO);
				}
		}
		catch(Exception ex){
			throw new Exception("Error ",ex);
		}
		return listConfigDTO;
	}
	public ConfigDTO getConfigById(String id) throws Exception{
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
		ConfigDTO configDTO=null;
		try{
			conn=DataSource.getInstance().getConnection();
			pst=conn.prepareStatement("select fvid,fvcname,fvcdescription,fbsecret from config where fvid=?");
			pst.setString(1, id);
			result=pst.executeQuery();
			while(result.next()){
				configDTO= new ConfigDTO();
				configDTO.setId(result.getString("fvid"));
				configDTO.setName(result.getString("fvcname"));
				configDTO.setDescription(result.getString("fvcdescription"));
				configDTO.setSecret(result.getBoolean("fbsecret"));
			}
		}
		catch(Exception ex){
			throw new Exception("Error ",ex);
		}
		return configDTO;
	}
}
