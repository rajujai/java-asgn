package com.raju.app.usecases;

import com.raju.app.beans.Employee;
import com.raju.app.dao.EmployeeDao;
import com.raju.app.exceptions.EmployeeDaoImpl;
import com.raju.app.exceptions.EmployeeException;

public class Main {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		dao.saveEmployeeDetails(new Employee(1,"Mohan", "Kungar", 80000));
		dao.saveEmployeeDetails(new Employee(2,"Raj", "Hisar", 80000));
		dao.saveEmployeeDetails(new Employee(3,"Amit", "Lj", 82000));
		dao.saveEmployeeDetails(new Employee(4,"Monti", "Bk", 88000));
		try {
			System.out.println(dao.getEmployeeById(1));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(dao.getAllEmployees());
		try {
			System.out.println(dao.deleteEmployee(3));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
