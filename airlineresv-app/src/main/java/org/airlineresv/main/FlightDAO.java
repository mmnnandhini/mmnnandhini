package org.airlineresv.main;

import java.sql.*;


public class FlightDAO {
	
public void displayFlightInfo() throws SQLException{
		
		String query = "Select * from flight";
		Connection con = MysqlDBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Flight No : " + rs.getInt(1));
		    System.out.println("Flight Name : " + rs.getString(2));
			System.out.println("Flight Location : " + rs.getString(3));
			System.out.println("Flight Destination : " + rs.getString(4));
		    System.out.println("Capacity : " + rs.getInt(5));
		    
		    System.out.println("--------------------------------------");
			
		}
		
	}

	public int getCapacity(int id) throws SQLException{
		String query = "Select capacity from flight where id=" + id;
		Connection con = MysqlDBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}

}
