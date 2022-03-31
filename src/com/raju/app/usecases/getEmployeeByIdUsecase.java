package com.raju.app.usecases;

import java.util.Scanner;

import com.raju.app.beans.Employee;
import com.raju.app.dao.EmployeeDao;
import com.raju.app.dao.EmployeeDaoImpl;
import com.raju.app.exceptions.EmployeeException;


public class getEmployeeByIdUsecase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee Id:");
		int empId = sc.nextInt();
		EmployeeDao empD = new EmployeeDaoImpl();
		try {
			Employee emp = empD.getEmployeeById(empId);
			System.out.println(emp);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
	}
}