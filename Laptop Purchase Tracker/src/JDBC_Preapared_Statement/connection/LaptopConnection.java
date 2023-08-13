package JDBC_Preapared_Statement.connection;

import java.sql.*;

public class LaptopConnection {
  public static Connection getLapCon() 
  {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/project01";
		String user ="root";
		String pass ="root";
		return DriverManager.getConnection(url, user, pass);
	} catch (ClassNotFoundException | SQLException   e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
  } 
}
