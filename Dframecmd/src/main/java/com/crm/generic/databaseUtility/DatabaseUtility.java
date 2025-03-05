package com.crm.generic.databaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {
	Connection conn=null;
	
	public void getconnectionToDB() throws SQLException {
		try {
	Driver driverref = new Driver();
	DriverManager.registerDriver(driverref);
	conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
		}catch(Exception e) {
			
		}
	}	
	
	public ResultSet executeSelectQuery(String query) throws SQLException {
		
		ResultSet resultset = null;
		try {
	 Statement stat = conn.createStatement();
	 resultset = stat.executeQuery(query);
		}catch(Exception e) {		
	}
		return resultset;
	}
	
	public int executeUpdateQuery(String query) throws SQLException {
		int resultset = 0;
		
		try {
	 Statement stat = conn.createStatement();
	 resultset = stat.executeUpdate(query);
		}catch(Exception e) {		
	}
		return resultset;
	}
	
	public void closeDBConnection() throws SQLException {
		try {
			conn.close();
		}catch(Exception e) {
			
	}
		}
}
