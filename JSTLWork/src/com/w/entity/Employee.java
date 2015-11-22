package com.w.entity;

public class Employee {
	private String id;
	private String name;
	private String position;
	private String sex;
	private String salary;
	private String date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Employee(String id, String name, String position, String sex, String salary, String date) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.sex = sex;
		this.salary = salary;
		this.date = date;
	}
	public Employee() {
		super();
	}
	
}
