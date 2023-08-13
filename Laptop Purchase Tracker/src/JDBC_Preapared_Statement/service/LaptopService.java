package JDBC_Preapared_Statement.service;
import JDBC_Preapared_Statement.connection.dao.*;
import JDBC_Preapared_Statement.dao.Laptop;
public class LaptopService {
	LaptopDao l1 = new LaptopDao();
	public Laptop saveLaptop(Laptop l) {
		return l1.saveLaptop(l);
	}
	public Laptop getById(int b) {
		return l1.getById(b);
	}
}
