package com.raju.app.dao;

import java.util.List;

import com.raju.app.beans.Employee;
import com.raju.app.exceptions.EmployeeException;

public interface EmployeeDao {
	public Employee getEmployeeById(int empId)throws EmployeeException;

	public List<Employee> getAllEmployee();

	public String saveEmployeeDetails(Employee employee);

	public boolean deleteEmployeeById(int empId)throws EmployeeException;

	public String giveBonusToEmployee(int empId, int amount)throws EmployeeException;
}