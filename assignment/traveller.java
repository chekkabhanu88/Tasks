package assignment;

import java.time.LocalDate;

public class traveller 
{
	private String name;
	private int mobileno;
	private String email;
	private String flightid;
	private LocalDate date;
	public traveller(String name, int mobileno, String email, String flightid, LocalDate date) {
		
		this.name = name;
		this.mobileno = mobileno;
		this.email = email;
		this.flightid = flightid;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	

}
