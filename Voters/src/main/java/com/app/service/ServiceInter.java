package com.app.service;

import com.app.model.Employee;

public class ServiceInter {
	public void save(Employee e) {
		Employee e1 = new Employee();
		e1.seteId(20);
		e1.seteName("gatta");
		System.out.println(e1);
	}
}
