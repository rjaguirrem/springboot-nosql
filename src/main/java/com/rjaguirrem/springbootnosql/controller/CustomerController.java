package com.rjaguirrem.springbootnosql.controller;

import com.rjaguirrem.springbootnosql.model.Customer;
import com.rjaguirrem.springbootnosql.service.api.CustomerService;
import com.rjaguirrem.springbootnosql.service.api.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer/api")
@CrossOrigin("*")
public class CustomerController {
  @Autowired
  private CustomerService customerService;

  @Autowired
  private SequenceGeneratorService sequenceGeneratorService;

  @GetMapping(value="/all")
  public List<Customer> getAll(){
    return customerService.getAll();
  }

  @GetMapping(value="/find/{id}")
  public Customer find(@PathVariable Long id){
    return customerService.get(id);
  }

  @PostMapping(value="/save")
  public ResponseEntity<Customer> save(@RequestBody Customer customer){
    //generate sequence
    customer.setId(sequenceGeneratorService.getSequenceNumber(Customer.SEQUENCE_NAME));

    Customer obj = customerService.save(customer);
    return new ResponseEntity<Customer>(obj, HttpStatus.OK);
  }

  @GetMapping(value="/delete/{id}")
  public ResponseEntity<Customer> delete(@PathVariable Long id){
    Customer customer = customerService.get(id);
    if (customer != null){
      customerService.delete(id);
    } else {
      return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
    }

    return new ResponseEntity<Customer>(customer, HttpStatus.OK);
  }
}