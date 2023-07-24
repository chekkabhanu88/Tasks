package assignment;

public class Address 
{
	private int ano;
	private int apincode;
	private String adistrict;
	public Address(int ano, int apincode, String adistrict) {
		
		this.ano = ano;
		this.apincode = apincode;
		this.adistrict = adistrict;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getApincode() {
		return apincode;
	}
	public void setApincode(int apincode) {
		this.apincode = apincode;
	}
	public String getAdistrict() {
		return adistrict;
	}
	public void setAdistrict(String adistrict) {
		this.adistrict = adistrict;
	}
	
	
	

}
