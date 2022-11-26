package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	public Employee updateEmployee(Employee emp, int id);
	public void deleteEmployee(int id);
}
