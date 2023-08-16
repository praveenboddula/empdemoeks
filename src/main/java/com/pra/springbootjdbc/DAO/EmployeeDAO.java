package com.pra.springbootjdbc.DAO;

import java.util.List;

import com.pra.springbootjdbc.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public int deleteById(int id);
	
	public int save(Employee e);
	
	public int update(Employee e, int id);
}