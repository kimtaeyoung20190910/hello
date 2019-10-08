package com.board.impl;

import java.util.List;

import com.board.model.Employee;
import com.board.model.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	EmpDAO dao = new EmpDAO();

	@Override
	public List<Employee> getEmpList() {

		List<Employee> list = dao.getEmpList();
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Employee getEmployee(int empNo) {
		Employee e = dao.getEmp(empNo);
		return e;
	}

	@Override
	public void insertEmployee(Employee emp) {
//		dao.insertEmp(emp);
		dao.insertEmpProc(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
	}

	@Override
	public void deleteEmployee(int empNo) {
		dao.deleteEmp(empNo);
	}

}
