package com.example.prctice.Practice.service;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.prctice.Practice.Dto.CustomerDto;
import com.example.prctice.Practice.entity.Customer;
import com.example.prctice.Practice.repository.CustomerRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public void  addCustomer( CustomerDto customerDto) {
		Customer customer=new Customer();
		BeanUtils.copyProperties(customerDto, customer);
		
		customerRepository.save(customer);
		
	}
	}


