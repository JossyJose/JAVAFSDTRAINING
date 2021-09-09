package com.ust.springboot;

import java.util.List;

public class Employees {
	List<Emp> employees;

	public Employees(List<Emp> employees) {
		super();
		this.employees = employees;
	}

	public List<Emp> getEmployees() {
		return employees;
	}

	public Employees() {
		super();
	}

	public void setemp(List<Emp> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "employees [emp=" + employees + "]";
	}
	

}
