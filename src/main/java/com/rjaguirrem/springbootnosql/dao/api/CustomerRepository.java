package com.rjaguirrem.springbootnosql.dao.api;

import com.rjaguirrem.springbootnosql.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, Long> {

}
