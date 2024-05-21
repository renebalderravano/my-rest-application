package com.myapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapplication.model.Customer;
import com.myapplication.model.HousingLocation;
import com.myapplication.util.BaseController;

@RestController
@RequestMapping(path = "customer")
public class CustomerController extends BaseController<Customer>  {
	
}
