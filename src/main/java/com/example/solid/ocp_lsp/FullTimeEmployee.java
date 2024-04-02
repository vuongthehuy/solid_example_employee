package com.example.solid.ocp_lsp;

public class FullTimeEmployee extends EmployeeCalSalary {
    public FullTimeEmployee(double hourlyRate) {
        super(hourlyRate);
    }

	// Thêm phương thức này để tính toán lương hàng tuần cho nhân viên toàn thời gian
	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		return hourlyRate * 40; // Giả sử một tuần làm việc 40 giờ
	}

}