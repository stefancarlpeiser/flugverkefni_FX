package models;

public class ConnectFlight {
	
	// PRIVATE VARIABLES
	private String connLoc;
	private String connArrivalTime;
	private String connAirportId;
	private String connDepartTime;
	
	// CONSTRUCTOR
	public ConnectFlight(String connLoc, String connArrivalTime, String connAirportId,
						 String connDepartTime) {
		
		this.connLoc = connLoc;
		this.connArrivalTime = connArrivalTime;
		this.connAirportId = connAirportId;
		this.connDepartTime = connDepartTime;
		
	}
	
	// GET/SET METHODS
	public String getConnLoc() {
		return connLoc;
	}
	public void setConnLoc(String connLoc) {
		this.connLoc = connLoc;
	}
	public String getConnArrivalTime() {
		return connArrivalTime;
	}
	public void setConnArrivalTime(String connArrivalTime) {
		this.connArrivalTime = connArrivalTime;
	}
	public String getConnAirportId() {
		return connAirportId;
	}
	public void setConnAirportId(String connAirportId) {
		this.connAirportId = connAirportId;
	}
	public String getConnDepartTime() {
		return connDepartTime;
	}
	public void setConnDepartTime(String connDepartTime) {
		this.connDepartTime = connDepartTime;
	}
		
}