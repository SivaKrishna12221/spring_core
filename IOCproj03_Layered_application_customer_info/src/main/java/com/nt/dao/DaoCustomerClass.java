package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Customer;

@Repository("cust-dao")
public class DaoCustomerClass implements IDoaClass {

	private final static String SAVECUSTDETAILS = "insert into customer_nov values(?,?,?,?,?)";

	@Autowired
	private DataSource ds;
	int count;

	
	@Override
	public int saveCustDetails(Customer cust) throws Exception {
		try (Connection con = ds.getConnection(); PreparedStatement pstmt1 = con.prepareStatement(SAVECUSTDETAILS);) {
			pstmt1.setInt(1, cust.getCustId());
			pstmt1.setString(2, cust.getCustName());
			pstmt1.setDouble(3, cust.getAmount());
			pstmt1.setDouble(4, cust.getDiscount());
			pstmt1.setDouble(5, cust.getFinalBill());
			count = pstmt1.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
			return count;

	}

}
