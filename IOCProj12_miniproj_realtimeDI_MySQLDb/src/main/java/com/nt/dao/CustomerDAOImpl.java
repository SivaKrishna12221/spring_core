package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nt.model.Customer;

@Repository("custDAO")
public class CustomerDAOImpl implements IcustomerDAO {

	private static final String CUSTOMER_INFO_INSERT_QUERY = "INSERT INTO SPRING_CUST_INFO (CNAME,ADDRESS,BILLAMOUNT,DISCOUNT,FINALAMOUNT)VALUES(?,?,?,?,?)";

	@Autowired
	@Qualifier("db")
	public DataSource ds;//HAS-A relation

	public int insert(Customer cust) throws Exception {
		int count = 0;
		try (Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(CUSTOMER_INFO_INSERT_QUERY);) {
			ps.setString(1, cust.getCname());
			ps.setString(2, cust.getAddress());
			ps.setDouble(3, cust.getBillamount());
			ps.setDouble(4, cust.getDiscount());
			ps.setDouble(5, cust.getFinalamount());
			count = ps.executeUpdate();
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
