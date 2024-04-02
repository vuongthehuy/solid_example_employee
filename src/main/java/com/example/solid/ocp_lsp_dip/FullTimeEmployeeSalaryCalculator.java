package com.example.solid.ocp_lsp_dip;

public class FullTimeEmployeeSalaryCalculator implements SalaryCalculatorInterface {
	@Override
	public double calculateSalary(Employee employee) {
		// Tính toán lương cho nhân viên toàn thời gian
		//return employee.getHourlyRate() * 40;
		return employee.getMonthlySalary();
	}
}
