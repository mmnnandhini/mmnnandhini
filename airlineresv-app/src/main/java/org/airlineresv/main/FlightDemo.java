package org.airlineresv.main;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Scanner;

public class FlightDemo {

	public static void main(String[] args)  {
		
			FlightDAO flightdao = new FlightDAO();
		
			try {
			flightdao.displayFlightInfo();
			
			
			int userOpt =1;
			Scanner sc=new Scanner(System.in);
			
			
			
				
				 while(userOpt ==1) {
			      System.out.println("Enter 1 to book and 2 to exit");
			      userOpt = sc.nextInt();
			      if(userOpt==1) {
			    	  Booking booking=new Booking();
			    	  if(booking.isAvailable()) {
			    		  
			    		  BookingDAO bookingdao = new BookingDAO();
			    		  bookingdao.addBooking(booking);
			    		  System.out.println("Your booking is confirmed");
			    	  }
			      else
			      
			    	  System.out.println("Sorry!! Flight is full. Try another flight or date");
			      
			      }
				 }
			      sc.close();
				 }
				 catch(Exception e) {
						System.out.println(e); 
		}
				
	}

}
