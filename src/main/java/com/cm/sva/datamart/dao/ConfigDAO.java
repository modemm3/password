package com.cm.sva.datamart.dao;

import com.cm.sva.datamart.dao.connection.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cm.sva.datamart.dao.connection.DataSource;
import com.cm.sva.datamart.dto.ConfigDTO;

public class ConfigDAO {

    private static final String SAVE_CONFIG="INSERT INTO config(fvid,fvcname,fvcdescription,fbsecret,parent,image) values(?,?,?,?,?,?)";
    private static final String MAX_CONFIG="select max(fvid) id from config";
	public List<ConfigDTO> getListConfig(Integer length) throws Exception{
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
		
		List<ConfigDTO> listConfigDTO=new ArrayList<ConfigDTO>();
		try{
				conn=DataSource.getInstance().getConnection();
				pst=conn.prepareStatement("select fvid,fvcname,fvcdescription,fbsecret,image from config where length(fvid)=?");
				pst.setInt(1, length);
				result=pst.executeQuery();
				while(result.next()){
					ConfigDTO configDTO= new ConfigDTO();
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
                finally{
                    ConnectionManager.releaseResources(result, pst);
                    ConnectionManager.closeConnection(conn);
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
                finally{
                    ConnectionManager.releaseResources(result, pst);
                    ConnectionManager.closeConnection(conn);
                }
                
		return configDTO;
	}
	public String getMaxConfig() throws Exception{
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
		ConfigDTO configDTO=null;
		try{
			conn=DataSource.getInstance().getConnection();
			pst=conn.prepareStatement(MAX_CONFIG);
			result=pst.executeQuery();
                        if(result.next())
                            return result.getString("id");
		}
		catch(Exception ex){
			throw new Exception("Error ",ex);
		}
                finally{
                    ConnectionManager.releaseResources(result, pst);
                    ConnectionManager.closeConnection(conn);
                }
		return "";
	}

        public void save(List<ConfigDTO> listConfiDTO) throws Exception{
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
                try{
                    conn=DataSource.getInstance().getConnection();
                    conn.setAutoCommit(false);
                    pst=conn.prepareStatement(SAVE_CONFIG);
                    String maxId=getMaxConfig();
                    if(!maxId.equals("")){
                        String[] split = maxId.split("\\ ");
                        int id=split[0]!=null?Integer.parseInt(split[0])+1:1;
                        int i=0;
                        int count=0;
                        for(ConfigDTO configDTO:listConfiDTO){
                            if(i==0)
                                pst.setString(1, leftPad(id));
                            else
                                pst.setString(1, leftPad(id)+" "+leftPad(count));
                                
                            pst.setString(2, configDTO.getName());
                            pst.setString(3, configDTO.getDescription());
                            pst.setBoolean(4, configDTO.getSecret());
                            pst.setBoolean(5, configDTO.getParent());
                            pst.setString(6, configDTO.getImage());
                            pst.addBatch();
                            i++;
                            count++;
                        }
                        pst.executeBatch();
                        conn.commit();
                    }
                }
                catch(Exception ex){
                    throw new Exception("Error ",ex);
                }
                finally{
                    ConnectionManager.releaseResources(result, pst);
                    ConnectionManager.closeConnection(conn);
                }
                
        }
        public String leftPad(int value){
            if(value<10)
                return "0"+value;
            return ""+value;
        }
        
}
