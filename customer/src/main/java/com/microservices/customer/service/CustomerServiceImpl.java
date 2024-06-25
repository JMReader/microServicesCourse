package com.microservices.customer.service;

import com.microservices.customer.entity.Customer;
import com.microservices.customer.entity.dtos.CustomerRequestDTO;
import com.microservices.customer.entity.dtos.CustomerResponseDTO;
import com.microservices.customer.repository.CustomerRepository;
import com.microservices.customer.service.Interfaces.ICustomerService;
import com.microservices.customer.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements ICustomerService {
    //this line inject Customer repositoy with annotation RequiredArgsConstructor
    private final CustomerRepository customerRepository;


    @Override
    public void save(CustomerRequestDTO customer) {
        customerRepository.save(Mapper.dtoToEntity(customer));
    }

    @Override
    public CustomerResponseDTO findById(String id) {
        Customer c =  customerRepository.findById(id).orElse(null);
        CustomerResponseDTO response = Mapper.entityToDto(c);
        return response;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public Customer deleteById(String id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return List.of();
    }
}
