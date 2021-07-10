package com.core.app;

import java.time.LocalDate;
import java.util.Date;

public class Employees implements Comparable<Employees>{
	private int id;
	private String name;
	Department department;
	LocalDate dob;
	LocalDate hiredate;
	public Employees(int id, String name, Department department, LocalDate dob, LocalDate hiredate) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dob = dob;
		this.hiredate = hiredate;
	}



    @Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", department=" + department + ", dob=" + dob + ", hiredate="
				+ hiredate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}


	@Override
	public int compareTo(Employees anotherEmployee) {
		if(this.id<anotherEmployee.getId()){
			return -1;
		}
		else if(this.id> anotherEmployee.getId()){
			return 1;
		}
		else
			return 0;
	}
}
