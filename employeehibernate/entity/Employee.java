package com.mouritech.employeehibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private String EmployeeAddress;
	private float EmployeeSalary;
	private String EmployeePhn;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeAddress() {
		return EmployeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}
	public float getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	public String getEmployeePhn() {
		return EmployeePhn;
	}
	public void setEmployeePhn(String employeePhn) {
		EmployeePhn = employeePhn;
	}
	public Employee(int employeeId, String employeeName, String employeeEmail, String employeeAddress,
			float employeeSalary, String employeePhn) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		EmployeeAddress = employeeAddress;
		EmployeeSalary = employeeSalary;
		EmployeePhn = employeePhn;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", EmployeeAddress=" + EmployeeAddress + ", EmployeeSalary=" + EmployeeSalary
				+ ", EmployeePhn=" + EmployeePhn + "]";
	}
	
	
	
}
