package org.airlineresv.main;

import java.util.Date;
import java.sql.*;
public class BookingDAO {
	
public int getBookedCount(int flightNo,Date date) throws SQLException{
	
	
	String query = "select count(passenger_name) from booking where flight_no=? and travel_date=?";
	Connection con = MysqlDBConnection.getConnection();
	PreparedStatement pst = con.prepareStatement(query);
	java.sql.Date sqldate = new java.sql.Date(date.getTime());
	pst.setInt(1, flightNo);
	pst.setDate(2, sqldate);
	ResultSet rs = pst.executeQuery();
	rs.next();
	return rs.getInt(1);
}
	
	
		
	

	public void addBooking(Booking booking) throws SQLException{
		
		String query = "Insert into booking values(?,?,?,?,?,?,?,?)";
		Connection con = MysqlDBConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		pst.setString(1,booking.passengerName);
		pst.setString(2,booking.gender);
		pst.setString(3,booking.emailId);
		pst.setInt(4,booking.age);
		pst.setLong(5,booking.phoneNo);
		pst.setString(6,booking.flightName);
		pst.setInt(7,booking.flightNo);
		
		pst.setDate(8, sqldate);
		
		
		
		pst.executeUpdate();
		
		
	}
	

}



