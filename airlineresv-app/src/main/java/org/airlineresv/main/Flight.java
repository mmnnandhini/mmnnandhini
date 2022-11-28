package org.airlineresv.main;

public class Flight {
	
	private int flightNo;
	private String flightName;
	private int Capacity;
	private String flightLocation;
	private String flightDestination;
	
	Flight(int no,String name,String dest,String location,
			int cap){
		
		
		this.flightName = name;
		this.Capacity = cap;
		this.flightLocation = location;
		this.flightDestination = dest;
		
		
			}
	public int getflightNo() {
		return flightNo;
	}
	
	public String getflightName() {
		return flightName;
	}
	
	public String getflightLocation() {
		return flightLocation;
	}
	public String getflightDestination() {
		return flightDestination;
	}
	
	public int getCapacity() {
	return Capacity;
    }
	public void setflightNo(int no) {
		flightNo = no;
	}
	
	public void setflightName(String name) {
		flightName = name;
	}
	public void setflighhtLocation(String location) {
		flightLocation = location;
	}
	public void setflightDestination(String dest) {
		flightDestination = dest;
		
	}

	public void setCapacity(int cap) {
	Capacity = cap;
   }



	
}



