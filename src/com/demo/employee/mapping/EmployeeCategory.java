package com.demo.employee.mapping;

public class EmployeeCategory {

int employeeId;
String employeeName;
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
public EmployeeCategory(int employeeId, String employeeName) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
}



}
