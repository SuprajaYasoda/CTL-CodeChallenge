package com.cts.services.impl.test;

import java.math.BigDecimal;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import com.cts.services.impl.QATester;


public class QATesterTest {
	
	public QATester classUnderTest;
	
	@Test
	public void testConstructor_shouldReturnNewObject() {
		classUnderTest = new QATester();
		Assert.assertNotNull(classUnderTest);
	}
	
	@Test
	public void getAllocation_shouldReturn_500() {
		BigDecimal expenseAllocation = new BigDecimal("500");
		classUnderTest = new QATester();
		BigDecimal response = classUnderTest.getAllocation();
		Assert.assertThat(response, Is.is(expenseAllocation));
	}
	
	

}
