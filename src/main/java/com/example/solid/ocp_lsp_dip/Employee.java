package com.example.solid.ocp_lsp_dip;

public class Employee {
	// Các thuộc tính khác
	private String name;

	private int monthlySalary;

	private int hoursWorked;

	private int hourlyRate;

	public double calculateSalary(SalaryCalculatorInterface calculator) {
		return calculator.calculateSalary(this);
	}
	
	public double calculateSalaryeErr(SalaryCalculatorInterface calculator) {
		return this.hourlyRate * hoursWorked;
	}

	// Constructor và các phương thức getter/setter
	public Employee(String name, int monthlySalary, int hoursWorked, int hourlyRate) {
		super();
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	/**
	 * @param name
	 * @param monthlySalary
	 */
	public Employee(String name, int monthlySalary) {
		super();
		this.name = name;
		this.monthlySalary = monthlySalary;
	}
	

	/**
	 * @param name
	 * @param hoursWorked
	 * @param hourlyRate
	 */
	public Employee(String name, int hoursWorked, int hourlyRate) {
		super();
		this.name = name;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

}
