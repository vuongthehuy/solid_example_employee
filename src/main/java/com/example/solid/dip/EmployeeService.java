package com.example.solid.dip;

import com.example.solid.ocp_lsp_dip.*;

public class EmployeeService {
	
	private EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public String addEmployee(Employee employee) {
		return employeeRepository.saveEmployee(employee);
	}
	
	public String addEmployeeErr(Employee employee) {
		 SaveFullTimeEmployee save =  new SaveFullTimeEmployee();
		
		return save.saveEmployee(employee);
	}
}
