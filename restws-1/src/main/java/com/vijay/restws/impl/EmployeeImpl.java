package com.vijay.restws.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.vijay.restws.entities.EmployeeEntities;

@Configuration
@PropertySource("classpath:employee.properties")
public class EmployeeImpl {

	@Value("${employee.id}")
	private String employeeId;

	@Value("${employee.name}")
	private String employeeName;

	@Value("${employee.address}")
	private String employeeAddress;

	@Scheduled(cron = "0/1 * * * * ?")
	public void print() {

		System.out.println("The Employee Id is..." + employeeId);
		System.out.println("The Employee Name is..." + employeeName);
		System.out.println("The Employee Address is..." + employeeAddress);

		System.out.println("This class is not being executed......");
	}

}
