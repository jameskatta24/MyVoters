package com.app.model;

public class Employee {
private int eId;
private String eName;
public Employee() {
	super();
}
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
@Override
public String toString() {
	return "Employee [eId=" + eId + ", eName=" + eName + "]";
}

	private int id;
	private String name;
}
