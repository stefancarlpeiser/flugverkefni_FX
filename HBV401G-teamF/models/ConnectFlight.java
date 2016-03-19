package models;
import org.eclipse.swt.widgets.DateTime;

public class ConnectFlight {
	// PRIVATE VARIABLES
	private String connLoc;
	private DateTime connArrivalTime;
	private String connAirportId;
	private String connDepartTime;
	private int connGate;
	
	// GET/SET METHODS
	public String getConnLoc() {
		return connLoc;
	}
	public void setConnLoc(String connLoc) {
		this.connLoc = connLoc;
	}
	public DateTime getConnArrivalTime() {
		return connArrivalTime;
	}
	public void setConnArrivalTime(DateTime connArrivalTime) {
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
	public int getConnGate() {
		return connGate;
	}
	public void setConnGate(int connGate) {
		this.connGate = connGate;
	}
		
}
