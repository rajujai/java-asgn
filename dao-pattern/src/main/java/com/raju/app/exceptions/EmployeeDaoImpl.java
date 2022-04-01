package com.raju.app.exceptions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.raju.app.Utils.DbUtil;
import com.raju.app.beans.Employee;
import com.raju.app.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String saveEmployeeDetails(Employee employee) {
		String message = "Not Inserted!";
		try(Connection conn = DbUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());
			int x = ps.executeUpdate();
			if(x==1) message = "Employee details inserted!";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return message;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee employee = null;
		try(Connection conn = DbUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select * from employee where empId = ?");
			ps.setInt(1, empId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) employee =  new Employee(empId,rs.getString("name"), rs.getString("address"), rs.getInt("salary"));
			else throw new EmployeeException("Employee doesn't exists!");
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<>();
		try(Connection conn = DbUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Employee(rs.getInt("empId") ,rs.getString("name"), rs.getString("address"), rs.getInt("salary")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String deleteEmployee(int empId) throws EmployeeException {
		String message = "Employee doesn't exists!";
		try(Connection conn = DbUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("delete from employee where empId = ?");
			ps.setInt(1, empId);
			int x = ps.executeUpdate();
			if(x==1) message = empId+" employee deleted!";
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		return message;
	}
	

}
