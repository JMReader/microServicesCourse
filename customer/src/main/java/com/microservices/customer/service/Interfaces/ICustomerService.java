package com.microservices.customer.service.Interfaces;

import com.microservices.customer.entity.Customer;
import com.microservices.customer.entity.dtos.CustomerRequestDTO;
import com.microservices.customer.entity.dtos.CustomerResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ICustomerService is a Interface that
 * declares the methods that should be implemented
 * by the CustomerServiceImpl class. (its only a simple crud of Customer class)
 */

@Service
public interface ICustomerService {
     //post
      void save(CustomerRequestDTO customer);
     //get
      CustomerResponseDTO findById(String id);
      //put
      Customer update(Customer customer);
      //delete
      Customer deleteById(String id);
      //get all
      List<Customer> findAll();

}
