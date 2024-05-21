package com.myapplication.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myapplication.model.Customer;
import com.myapplication.service.CustomerService;
import com.myapplication.util.BaseService;

@Service
@Transactional
public class CustomerServiceImpl extends BaseService<Customer> implements CustomerService {

}
