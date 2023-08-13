package JDBC_Preapared_Statement.connection.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import JDBC_Preapared_Statement.connection.LaptopConnection;
import JDBC_Preapared_Statement.dao.*;

public class LaptopDao {
	
	Connection c1 = null;
	
	public Laptop saveLaptop(Laptop l) {
		
		int day  = LocalDate.now().getDayOfMonth();
		int month  = LocalDate.now().getMonthValue();
		int year  = LocalDate.now().getYear();
		Date date = new Date(year, month, day);
		c1 = LaptopConnection.getLapCon();
		String insert_query ="insert into laptop values(?,?,?,?)";
		PreparedStatement p1;
		try {
			p1 = c1.prepareStatement(insert_query);
			p1.setInt(1,l.getLaptopId() );
			p1.setString(2,l.getLaptopName() );
			p1.setDouble(3,l.getLaptopPrice() );
			p1.setDate(4,date);
			p1.execute();
			return l;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public Laptop getById(int l)
	{
		try 
		{
			String s = "select * from laptop where id = ?";
			c1 = LaptopConnection.getLapCon();
			PreparedStatement p1 ;
			try 
			{
				p1 = c1.prepareStatement(s);
				p1.setInt(1, l);
				ResultSet res =p1.executeQuery();
				while(res.next()) 
				{
					Laptop l1 = new Laptop();
					l1.setLaptopId(res.getInt("id"));
					l1.setLaptopName(res.getString("name"));
					l1.setLaptopPrice(res.getDouble("price"));
					
					l1.setPurchaseDate(res.getString("purchasedate"));
					return l1;
				}
			}catch(SQLException e) {
					e.printStackTrace();
			}
		   
		}catch(Exception e) {
			e.printStackTrace();
	    }
		return null;
	}
	
	
}
