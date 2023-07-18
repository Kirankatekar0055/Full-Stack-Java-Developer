package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SBEmp")
public class EmpRec 
{
	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private double salary;

	public EmpRec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpRec(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpRec [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
