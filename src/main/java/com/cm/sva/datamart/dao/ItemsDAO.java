package com.cm.sva.datamart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cm.sva.datamart.dao.connection.DataSource;
import com.cm.sva.datamart.dto.ItemsDTO;

public class ItemsDAO {

	public List<ItemsDTO> getListRecord(Integer recordId) throws Exception{
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
		ItemsDTO itemsDTO=null;
		List<ItemsDTO> listItemsDTO=new ArrayList<ItemsDTO>();
		try{
				conn=DataSource.getInstance().getConnection();
				pst=conn.prepareStatement("select fiid,fvcid,fvcvalue,firecordid from items where firecordid =? order by fvcid");
				pst.setInt(1, recordId);
				result=pst.executeQuery();
				while(result.next()){
					itemsDTO= new ItemsDTO();
					itemsDTO.setId(result.getInt("fiid"));
					itemsDTO.setConfigId(result.getString("fvcid"));
					itemsDTO.setValue(result.getString("fvcvalue"));
					itemsDTO.setRecordId(result.getInt("firecordid"));
					listItemsDTO.add(itemsDTO);
				}
		}
		catch(Exception ex){
			throw new Exception("Error ",ex);
		}
		return listItemsDTO;
	}
	public List<ItemsDTO> getItemById(Integer itemId) throws Exception{
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
		ItemsDTO itemsDTO=null;
		List<ItemsDTO> listItemsDTO=new ArrayList<ItemsDTO>();
		try{
			conn=DataSource.getInstance().getConnection();
			pst=conn.prepareStatement("select fiid,fvcid,fvcvalue,firecordid from items where fiid =?");
			pst.setInt(1, itemId);
			result=pst.executeQuery();
			while(result.next()){
				itemsDTO= new ItemsDTO();
				itemsDTO.setId(result.getInt("fiid"));
				itemsDTO.setConfigId(result.getString("fvcid"));
				itemsDTO.setValue(result.getString("fvcvalue"));
				itemsDTO.setRecordId(result.getInt("firecordid"));
				listItemsDTO.add(itemsDTO);
			}
		}
		catch(Exception ex){
			throw new Exception("Error ",ex);
		}
		return listItemsDTO;
	}
}
