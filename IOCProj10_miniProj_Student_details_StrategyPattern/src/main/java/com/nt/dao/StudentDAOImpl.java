package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Student;
@Repository("oracle_dao")
public class StudentDAOImpl implements IstudentDAO
{
    public static final String STUDENT_INFO_INSERT_QUERY="INSERT INTO SPRING_STUDENT_DETAILS VALUES(?,?,?,?,?,?,?)";
    @Autowired
    private DataSource ds;//has-a property
    
    
	@Override
	public int insert(Student stud) throws Exception
    {
	    int count=0;
		try(Connection con=ds.getConnection();
			 PreparedStatement pstmt=con.prepareStatement(STUDENT_INFO_INSERT_QUERY);
				){
			pstmt.setInt(1,stud.getRollno());
			pstmt.setString(2,stud.getSname());
			pstmt.setInt(3, stud.getMaths());
			pstmt.setInt(4, stud.getStats());
			pstmt.setInt(5, stud.getComps());
			pstmt.setFloat(6,stud.getAverage());
			pstmt.setInt(7,stud.getTotal());
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
