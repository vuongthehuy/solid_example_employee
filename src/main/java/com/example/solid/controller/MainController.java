package com.example.solid.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.solid.dip.*;
import com.example.solid.ocp_lsp.*;
import com.example.solid.ocp_lsp_dip.*;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/solid") // This means URL's start with /demo (after Application path)
public class MainController {

	@GetMapping(path = "/lspError")
	public @ResponseBody String lspError() {
		EmployeeCalSalary employee = new FullTimeEmployee(20);
		String result = "Weekly pay real:" + employee.calculateWeeklyPay(40);
		result += "\nWeekly pay error:" + employee.calculateWeeklyPay(50);
		return result;
	}

	@GetMapping(path = "/lspSuccess")
	public @ResponseBody String lspSuccess() {
		EmployeeCalSalary employee = new PartTimeEmployee(20);

		return "PartTime pay: " + employee.calculateWeeklyPay(50);
	}
	
	@GetMapping(path = "/lsp")
	public @ResponseBody String lsp() {
		Employee fullTimeEmployee = new Employee("John LSP", 50, 20);
		
		SalaryCalculatorInterface fullTimeCalculator = new FullTimeEmployeeSalaryCalculator();

		return "Full time pay: " + fullTimeEmployee.calculateSalary(fullTimeCalculator);
	}

	@GetMapping(path = "/ocp")
	public @ResponseBody String ocp() {
		Employee fullTimeEmployee = new Employee("John", 5000);
		Employee partTimeEmployee = new Employee("Alice", 40, 20);

		SalaryCalculatorInterface fullTimeCalculator = new FullTimeEmployeeSalaryCalculator();
		SalaryCalculatorInterface partTimeCalculator = new PartTimeEmployeeSalaryCalculator();

		// bằng cách truyền một đối tượng SalaryCalculatorInterface tương ứng mà không cần thay đổi mã nguồn của lớp Employee.
		String rep = "Full time employee salary: " + fullTimeEmployee.calculateSalary(fullTimeCalculator);
		rep += ("\nPart time employee salary: " + partTimeEmployee.calculateSalary(partTimeCalculator));
		return rep;
	}

	@GetMapping(path = "/dip")
	public @ResponseBody String dip() {
		 // Sử dụng SaveFullTimeEmployee với cơ sở dữ liệu 
		EmployeeRepository fullTimeEmployee = new SaveFullTimeEmployee();
		//EmployeeService để thêm nhân viên vào cơ sở dữ liệu mà không cần biết chi tiết về loại cơ sở dữ liệu nào đang được sử dụng
		//Vì EmployeeService phụ thuộc vào interface (EmployeeRepository) chứ không phải là các lớp cụ thể (SaveFullTimeEmployee hoặc SavePartTimeEmployee).
		EmployeeService saveFullTimeEmployee = new EmployeeService(fullTimeEmployee);
		String result1 = saveFullTimeEmployee.addEmployee( new Employee("John", 5000));
		

		 // Sử dụng SavePartTimeEmployee với cơ sở dữ liệu 
		EmployeeRepository partTimeEmployee = new SavePartTimeEmployee();
		EmployeeService savePartTimeEmployee = new EmployeeService(partTimeEmployee);
		String result2 = savePartTimeEmployee.addEmployee(new Employee("Alice", 40, 20));

		return result1 + "\n" + result2;
	}
}
