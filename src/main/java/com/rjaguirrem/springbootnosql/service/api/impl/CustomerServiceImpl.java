package com.rjaguirrem.springbootnosql.service.api.impl;

import com.rjaguirrem.springbootnosql.commons.impl.GenericServiceImpl;
import com.rjaguirrem.springbootnosql.dao.api.CustomerRepository;
import com.rjaguirrem.springbootnosql.model.Customer;
import com.rjaguirrem.springbootnosql.service.api.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends GenericServiceImpl<Customer, Long> implements CustomerService {
  @Autowired
  private CustomerRepository customerRepository;

  @Override
  public CrudRepository<Customer, Long> getDao(){
    return customerRepository;
  }
}
