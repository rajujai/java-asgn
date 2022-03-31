package com.raju.app.usecases;

import java.util.List;

import com.raju.app.beans.Employee;
import com.raju.app.dao.EmployeeDao;
import com.raju.app.dao.EmployeeDaoImpl;

public class getAllEmployeesUsecase {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		List<Employee> employees = dao.getAllEmployee();
		employees.forEach(employee -> System.out.println(employee));
	}
}