package models;

public class PassengerLuxuries {
	// PRIVATE VARIABLES
	private boolean wifiAvailable;
	private boolean mealsAvailable;
	private int priceInFlightPoints;
	private int flightPointsGained;
	
	// GET/SET METHODS
	public boolean isWifiAvailable() {
		return wifiAvailable;
	}
	public void setWifiAvailable(boolean wifiAvailable) {
		this.wifiAvailable = wifiAvailable;
	}
	public boolean isMealsAvailable() {
		return mealsAvailable;
	}
	public void setMealsAvailable(boolean mealsAvailable) {
		this.mealsAvailable = mealsAvailable;
	}
	public int getPriceInFlightPoints() {
		return priceInFlightPoints;
	}
	public void setPriceInFlightPoints(int priceInFlightPoints) {
		this.priceInFlightPoints = priceInFlightPoints;
	}
	public int getFlightPointsGained() {
		return flightPointsGained;
	}
	public void setFlightPointsGained(int flightPointsGained) {
		this.flightPointsGained = flightPointsGained;
	}
	
}
