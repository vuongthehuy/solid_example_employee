package com.example.solid.ocp_lsp;

public class EmployeeCalSalary {
    protected double hourlyRate;

    public EmployeeCalSalary(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double calculateWeeklyPay(int hoursWorked) {
        return hourlyRate * hoursWorked;
    }
    
    //Giả sử một tuần làm việc 40 giờ
    public double calculateCalSalary() {
        return hourlyRate * 40;
    }
}
