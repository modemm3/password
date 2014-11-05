package com.cm.sva.datamart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cm.sva.datamart.dao.connection.DataSource;
import com.cm.sva.datamart.dto.ConfigDTO;
import com.cm.sva.datamart.dto.RecordDTO;

public class RecordDAO {

	public List<RecordDTO> getListRecord(Integer userId,String configId) throws Exception{
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
		RecordDTO recordDTO=null;
		List<RecordDTO> listRecordDTO=new ArrayList<RecordDTO>();
		try{
				conn=DataSource.getInstance().getConnection();
				pst=conn.prepareStatement("select fiid,fvcname,fvcdescription,fiuserid,fvcconfigid from record where fiuserid =? and fvcconfigid=?");
				pst.setInt(1, userId);
				pst.setString(2, configId);
				result=pst.executeQuery();
				while(result.next()){
					recordDTO= new RecordDTO();
					recordDTO.setId(result.getInt("fiid"));
					recordDTO.setName(result.getString("fvcname"));
					recordDTO.setDescription(result.getString("fvcdescription"));
					recordDTO.setUserId(result.getInt("fiuserid"));
					recordDTO.setConfigId(result.getString("fvcconfigid"));
					listRecordDTO.add(recordDTO);
				}
		}
		catch(Exception ex){
			throw new Exception("Error ",ex);
		}
		return listRecordDTO;
	}
	public List<RecordDTO> getRecordById(Integer recordId) throws Exception{
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
		RecordDTO recordDTO=null;
		List<RecordDTO> listRecordDTO=new ArrayList<RecordDTO>();
		try{
				conn=DataSource.getInstance().getConnection();
				pst=conn.prepareStatement("select fiid,fvcname,fvcdescription,fiuserid,fvcconfigid from record where fiid =?");
				pst.setInt(1, recordId);
				result=pst.executeQuery();
				while(result.next()){
					recordDTO= new RecordDTO();
					recordDTO.setId(result.getInt("fiid"));
					recordDTO.setName(result.getString("fvcname"));
					recordDTO.setDescription(result.getString("fvcdescription"));
					recordDTO.setUserId(result.getInt("fiuserid"));
					recordDTO.setConfigId(result.getString("fvcconfigid"));
					listRecordDTO.add(recordDTO);
				}
		}
		catch(Exception ex){
			throw new Exception("Error ",ex);
		}
		return listRecordDTO;
	}
}
