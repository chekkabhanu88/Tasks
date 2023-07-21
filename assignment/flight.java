package assignment;

public class flight 
{
	private String flightid;
	private String source;
	private String destination;
	private double fare;
	private int totalseats;
	private int availableseats;
	private String atime;
	private String dtime;
	private String companyname;
	public flight(String flightid, String source, String destination, double fare, int totalseats, int availableseats,
			String atime, String dtime, String companyname) 
	{
		
		this.flightid = flightid;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.totalseats = totalseats;
		this.availableseats = availableseats;
		this.atime = atime;
		this.dtime = dtime;
		this.companyname = companyname;
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getTotalseats() {
		return totalseats;
	}
	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}
	public int getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}
	public String getAtime() {
		return atime;
	}
	public void setAtime(String atime) {
		this.atime = atime;
	}
	public String getDtime() {
		return dtime;
	}
	public void setDtime(String dtime) {
		this.dtime = dtime;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
	
	
	
	

}
