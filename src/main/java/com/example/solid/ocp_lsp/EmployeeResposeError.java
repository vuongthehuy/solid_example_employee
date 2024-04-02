package com.example.solid.ocp_lsp;

//Sai - Lớp này có nhiều hơn một lý do để thay đổi
class EmployeeResposeError {
	public void calculateSalary(Long Id) {
		// Tính lương nhân viên
	}

	public void getInforEmployee(Long Id) {
		// lấy thông tin nv
	}
}


class calculateSalaryProcessor {
	public void calculateSalary(Long Id) {
		// Tính lương nhân viên
	}
}

class getInforEmployeeProcessor {
	public void getInforEmployee(Long Id) {
		// lấy thông tin nv
	}
}