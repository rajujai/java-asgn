package com.raju.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.raju.app.beans.Employee;
import com.raju.app.exceptions.EmployeeException;
import com.raju.app.utils.DbUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee employee = null;
		try (Connection conn = DbUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from employee where eid = ?");
			ps.setInt(1, empId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) employee = new Employee(empId, rs.getString("name"), rs.getString("address"), rs.getInt("salary"));
			else throw new EmployeeException("Invalid Id! No employee found with id: "+empId);
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<>();
		try (Connection conn = DbUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				employees.add(new Employee(rs.getInt("eid"), rs.getString("name"), rs.getString("address"), rs.getInt("salary")));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return employees;
	}

	@Override
	public String saveEmployeeDetails(Employee employee) {
		String message = "Employee already exists !";
		try (Connection conn = DbUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());
			int x = ps.executeUpdate();
			if(x==1) message = x+" Employee details inserted!";
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return message;
	}

	@Override
	public boolean deleteEmployeeById(int empId) throws EmployeeException {
		boolean res = false;
		try (Connection conn = DbUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("delete from employee where eid = ?");
			ps.setInt(1, empId);
			int x = ps.executeUpdate();
			if(x==1) res = true;
			else throw new EmployeeException("Employee not found from id: "+empId);
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		return res;
	}

	@Override
	public String giveBonusToEmployee(int empId, int amount) throws EmployeeException {
		String message = "Something went wrong!";
		try (Connection conn = DbUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("update employee set salary=salary+? where eid=?");
			ps.setInt(1, amount);
			ps.setInt(2, empId);
			int x = ps.executeUpdate();
			if(x==1) message = amount+" rupees bonus given to employee: "+empId;
			else throw new EmployeeException("Employee not found from id: "+empId);
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		return message;
	}

}