package com.example.solid.ocp_lsp_dip;

public class PartTimeEmployeeSalaryCalculator implements SalaryCalculatorInterface {
	@Override
	public double calculateSalary(Employee employee) {
		// Tính toán lương cho nhân viên bán thời gian
		return employee.getHourlyRate() * employee.getHoursWorked();
	}
}