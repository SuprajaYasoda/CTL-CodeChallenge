package com.cts.services.impl;

import java.math.BigDecimal;

import com.cts.services.Employee;

public class AllocationService {
	private Employee employee;

	public AllocationService(Employee employee) {
		super();
		this.employee = employee;
	}

	public BigDecimal getAllocation() {
		return employee.getAllocation();
	}

}
