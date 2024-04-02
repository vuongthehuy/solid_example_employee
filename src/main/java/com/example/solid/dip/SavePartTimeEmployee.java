package com.example.solid.dip;
import com.example.solid.ocp_lsp_dip.*;

public class SavePartTimeEmployee implements EmployeeRepository{
	
    @Override
    public String saveEmployee(Employee employee)  {
        // Lưu thông tin nhân viên vào cơ sở dữ liệu
        return "Saving PartTimeEmployee to database: " + employee.getName();
    }
}
