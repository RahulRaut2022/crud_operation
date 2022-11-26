package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.exception.ResourceNotFoundException;
import com.employee.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public Employee createEmployee(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return empRepo.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee,int id) {
		
		Employee employee2 = empRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee","Id",id));
		employee2.setFirstName(employee.getFirstName());
		employee2.setLastName(employee.getLastName());
		employee2.setEmail(employee.getEmail());
		employee2.setAge(employee.getAge());
		empRepo.save(employee2);
		
		return employee2;
	}

	@Override
	public void deleteEmployee(int id) {

		empRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee","Id",id));
		
		empRepo.deleteById(id);
	}

}
