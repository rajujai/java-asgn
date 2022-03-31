package com.raju.app.usecases;

import java.util.Scanner;

import com.raju.app.dao.EmployeeDao;
import com.raju.app.dao.EmployeeDaoImpl;
import com.raju.app.exceptions.EmployeeException;

public class deleteEmployeeByIdUsecase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id to delete the records :");
		int empId = sc.nextInt();
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			boolean res = dao.deleteEmployeeById(empId);
			if(res) System.out.println("Records of employee: "+empId+" deleted !");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
