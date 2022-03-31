package com.raju.app.usecases;

import java.util.Scanner;

import com.raju.app.beans.Employee;
import com.raju.app.dao.EmployeeDao;
import com.raju.app.dao.EmployeeDaoImpl;

public class saveEmployeeDetailsUsecase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details to save the employee details :");
		System.out.println("Enter Employee Id :");
		int empId = sc.nextInt();
		System.out.println("Enter Employee Name :");
		String empName = sc.next();
		System.out.println("Enter Employee Addrerss :");
		String empAddress = sc.next();
		System.out.println("Enter Employee Salary :");
		int empSalary = sc.nextInt();
		EmployeeDao dao = new EmployeeDaoImpl();
		Employee emp = new Employee(empId, empName, empAddress, empSalary);
		String s = dao.saveEmployeeDetails(emp);
		System.out.println(s);
	}
}
