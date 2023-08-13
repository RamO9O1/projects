package JDBC_Preapared_Statement.controller;

import JDBC_Preapared_Statement.dao.Laptop;
import JDBC_Preapared_Statement.service.LaptopService;
import java.util.*;

public class LaptopController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter:\n1- TO ADD DATA \n2- FOR GET DATA  ");
		int a = sc.nextInt();

		switch (a) {
			case 1: {
				Laptop l1 = new Laptop();
				System.out.println("ENTER THE ID");
				l1.setLaptopId(sc.nextInt());
//				sc.next();
				System.out.println("ENTER THE LAPTOP NAME");
				l1.setLaptopName(sc.next());
				System.out.println("ENTER THE LAPTOP PRICE");
				l1.setLaptopPrice(sc.nextFloat());
				LaptopService ls = new LaptopService();
				Laptop l2 = ls.saveLaptop(l1);
				if (l2 != null) {
					System.out.println("Data Entered");
				} else {
					System.out.println("Data Not Entered");
				}
				break;
			}
			case 2: {
				LaptopService ls = new LaptopService();
				System.out.println("ENTER THE ID TO GET THE DATA");
				int b = sc.nextInt();
				Laptop l1 = ls.getById(b);
				if (l1 != null) {
					System.out.println("id--> " + l1.getLaptopId());
					System.out.println("name--> " + l1.getLaptopName());
					System.out.println("price--> " + l1.getLaptopPrice());
					System.out.println("date--> " + l1.getPurchaseDate());
				} else {
					System.out.println("Data Not found");
				}

				break;
			}
			default: {
				System.out.println("Didn't choose anythong!!!!");
			}
		}
		System.out.println("Thank You!");
		sc.close();
	}

}
