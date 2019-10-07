package com.board.model;

import java.util.List;

public interface EmployeeService {

	public List<Employee> getEmpList();	 //전체 리스트.
		
	public Employee getEmployee(int empNo);  //한건조회.

	public void insertEmployee(Employee emp);  //한건입력.
	
	public void updateEmployee(Employee emp);  //변경처리.
	
	public void deleteEmployee(int empNo);  //삭제처리.
	
	}

