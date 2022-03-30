package com.raju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment {
	
	void getSalaryByEmployeeIdInput(Connection conn, Scanner sc) {
		System.out.println("Enter employee id whose salary you want to see :");
		int empId = sc.nextInt();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("select salary from employee where eid=?");
			ps.setInt(1, empId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) System.out.println("Salary of Employee Id: "+empId+" is RS "+rs.getInt("salary")+"/-");
			else System.out.println("Invalid Id !");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void getAllEmployeesData(Connection conn) {
		try {
			PreparedStatement ps = conn.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("<====== Employee "+rs.getInt("eid")+" details ======>");
				System.out.println("Employee name is "+rs.getString("name"));
				System.out.println("Employee address is "+rs.getString("address"));
				System.out.println("Employee salary is "+rs.getInt("salary"));
				System.out.println("<==================================>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void addBonus(Connection conn, int bonus) {
		try {
			PreparedStatement ps = conn.prepareStatement("update employee set salary=salary+?");
			ps.setInt(1,bonus);
			int x = ps.executeUpdate();
			if(x>0) System.out.println("Bonus "+bonus+" given to "+x+" employees");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void addEmployeeWithoutAddress(Connection conn, Scanner sc) {
		System.out.println("Enter employee id :");
		int eid = sc.nextInt();
		System.out.println("Enter employee name :");
		String name = sc.next();
		System.out.println("Enter employee salary :");
		int salary = sc.nextInt();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into employee (eid, name, salary) values(?,?,?)");
			ps.setInt(1, eid);
			ps.setString(2, name);
			ps.setInt(3, salary);
			int x = ps.executeUpdate();
			if(x==1) System.out.println("Inserted successfully..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void getEmployeeByEmployeeIdInput(Connection conn, Scanner sc) {
		System.out.println("Enter employee id whom you want to see :");
		int empId = sc.nextInt();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("select * from employee where eid=?");
			ps.setInt(1, empId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println();
				System.out.print(rs.getString("name"));
				if(rs.getString("address")!=null)
				System.out.print(" from "+rs.getString("address"));
				else System.out.print(" address not available");
				System.out.print(" earning "+rs.getInt("salary")+"/");
				System.out.println();
			}
			else System.out.println("Invalid Id !");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void getEmployeeSalaryMoreThan(Connection conn, int empSalary) {
		try {
			PreparedStatement ps = conn.prepareStatement("select * from employee where salary>?");
			ps.setInt(1, empSalary);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("<====== Employee "+rs.getInt("eid")+" details ======>");
				System.out.println("Employee name is "+rs.getString("name"));
				System.out.println("Employee address is "+rs.getString("address"));
				System.out.println("Employee salary is "+rs.getInt("salary"));
				System.out.println("<==================================>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/db1";
		try(Connection conn = DriverManager.getConnection(url, "root", "rajujai")){
			Assignment manager = new Assignment();
			manager.getSalaryByEmployeeIdInput(conn, sc);
			manager.getAllEmployeesData(conn);
			manager.addBonus(conn, 500);
			manager.addEmployeeWithoutAddress(conn, sc);
			manager.getEmployeeByEmployeeIdInput(conn, sc);
			manager.getEmployeeSalaryMoreThan(conn, 80000);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
