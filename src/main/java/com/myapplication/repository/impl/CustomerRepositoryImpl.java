package com.myapplication.repository.impl;

import org.springframework.stereotype.Repository;

import com.myapplication.model.Customer;
import com.myapplication.repository.CustomerRepository;
import com.myapplication.util.BaseRespository;


@Repository
public class CustomerRepositoryImpl extends BaseRespository<Customer> implements CustomerRepository {

}
