package com.raju.app.dao;

import java.util.List;

import com.raju.app.beans.Employee;
import com.raju.app.exceptions.EmployeeException;

public interface EmployeeDao {
	public String saveEmployeeDetails(Employee employee);

	public Employee getEmployeeById(int empId) throws EmployeeException;

	public List<Employee> getAllEmployees();

	public String deleteEmployee(int empId)throws EmployeeException;
}
