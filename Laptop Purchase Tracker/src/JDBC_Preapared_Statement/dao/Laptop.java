package JDBC_Preapared_Statement.dao;

import java.time.LocalDate;
/**
 * 
 * @author Piyush Patel
 * 
 * Project for laptop purchase 
 *
 */
public class Laptop {
	private int laptopId;
	private String laptopName;
	private String purchaseDate;
	private double laptopPrice;
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	
	public double getLaptopPrice() {
		return laptopPrice;
	}
	public void setLaptopPrice(double laptopPrice) {
		this.laptopPrice = laptopPrice;
	}
	
}
