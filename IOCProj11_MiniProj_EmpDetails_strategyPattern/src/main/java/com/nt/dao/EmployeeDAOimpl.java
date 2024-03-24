package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository("oracle-dao")
public class EmployeeDAOimpl implements IemployeeDAO
{
  private static final String EMPLOYEE_INFO_INSERT_QUERY="INSERT INTO SPRING_EMPLOYEE_DETAILS VALUES(?,?,?,?,?,?)";
  @Autowired
  private DataSource ds;

  public int insert(Employee emp)throws Exception
  {
	  int count=0;
	 try(Connection con=ds.getConnection();
		 PreparedStatement pstmt=con.prepareStatement(EMPLOYEE_INFO_INSERT_QUERY);
			 ){
		 pstmt.setInt(1,emp.getEmpno());
		 pstmt.setString(2,emp.getEname());
		 pstmt.setString(3,emp.getJob());
		 pstmt.setFloat(4,emp.getSal());
		 pstmt.setFloat(5,emp.getGsal());
		 pstmt.setFloat(6,emp.getNetsal());
		 pstmt.executeUpdate();
	 }
	 catch(SQLException se)
	 {
		 se.printStackTrace();
		 throw se;
	 }
	 catch(Exception e)
	 {
		e.printStackTrace();
		throw e;
	 }
	 return count;
  }
}