package com.app.service;

import com.app.model.Employee;
import com.app.model.User;

public class ServiceInter {
	public void save(Employee e) {
		User u = new User();
		u.setId(1);
		u.setName("mani");
		System.out.println(u);

		Employee e1 = new Employee();
		e1.seteId(20);
		e1.seteName("gatta");
		System.out.println(e1);

	}
}
