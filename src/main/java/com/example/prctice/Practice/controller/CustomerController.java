package com.example.prctice.Practice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.prctice.Practice.Dto.CustomerDto;
import com.example.prctice.Practice.service.CustomerService;

@RestController
@RequestMapping("")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	
	                 @PostMapping("/register")
	              public ResponseEntity<String>   addCustomer(@Valid @RequestBody CustomerDto customerDto) {
	                	 customerService.addCustomer(customerDto);
	                	 
	                    	return  new ResponseEntity<>("customer registered sucessfully",HttpStatus.OK);
	}
	}
	 

