package com.vijay.restws.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.vijay.restws.entities.EmployeeEntities;

@Component
public class EmployeeImpl {
	
	@Autowired
	private EmployeeEntities employeeEntities;

	@Scheduled(cron="0/1 * * * * ?")
	public void print() {
					
		System.out.println(employeeEntities.getId() + employeeEntities.getName() + employeeEntities.getAddress());	
	}
	

}
