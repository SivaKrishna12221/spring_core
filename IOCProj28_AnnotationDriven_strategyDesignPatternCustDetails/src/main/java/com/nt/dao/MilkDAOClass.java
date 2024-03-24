package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.MilkSeller;
@Repository("oracleDao")
public class MilkDAOClass implements MilkDAOInterface
{
  private static final String MILKSELLER_INSERT_DATA_QUERY="INSERT INTO VEERADEVIMILKDAIRY VALUES(SYSDATE,?,?,?,?,?,?,?)"; 
  @Autowired
  private DataSource ds;
  
  public int insertData(MilkSeller ms)throws Exception
  {
	 int count =0;
	 try {
		Connection con=ds.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MILKSELLER_INSERT_DATA_QUERY);
		 pstmt.setInt(1,ms.getId());
		 pstmt.setString(2,ms.getName());
		 pstmt.setString(3,ms.getAddress());
		 pstmt.setFloat(4,ms.getLitres());
		 pstmt.setFloat(5,ms.getFat());
		 pstmt.setFloat(6,ms.getLitreCost());
		 pstmt.setFloat(7, ms.getAmount());
		 count=pstmt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw e;
	}
	 catch(Exception e)
	 {
		 e.printStackTrace();
		 throw e;
	 }
	 return count;
  }
}
