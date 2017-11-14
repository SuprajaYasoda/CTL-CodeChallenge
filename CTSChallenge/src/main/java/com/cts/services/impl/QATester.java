package com.cts.services.impl;

import java.math.BigDecimal;

import com.cts.services.Employee;

public class QATester implements Employee{
	private final static BigDecimal allocation = new BigDecimal("500");
	public QATester() {
		super();
	}
	public BigDecimal getAllocation() {
		return QATester.allocation;
	}
	public void add(Employee employee)  {
		// N/A. In some business cases you could throw an exception
		
	}
	public void remove(Employee employee) {
		// N/A. In some business cases you could throw an exception
		
	}
}
