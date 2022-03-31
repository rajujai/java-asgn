package com.raju.app.usecases;

import java.util.Scanner;

import com.raju.app.dao.EmployeeDao;
import com.raju.app.dao.EmployeeDaoImpl;
import com.raju.app.exceptions.EmployeeException;

public class giveBonusToEmployeeUseCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details to give bonus :");
		System.out.println("Enter employee id :");
		int empId = sc.nextInt();
		System.out.println("Enter bonus amount :");
		int bonus = sc.nextInt();
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			String s = dao.giveBonusToEmployee(empId, bonus);
			System.out.println(s);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
