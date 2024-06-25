package com.microservices.customer.util;

import com.microservices.customer.entity.Customer;
import com.microservices.customer.entity.dtos.CustomerRequestDTO;
import com.microservices.customer.entity.dtos.CustomerResponseDTO;

public class Mapper {
     public static Customer dtoToEntity(CustomerRequestDTO dto) {
        return new Customer(dto.getName(), dto.getEmail());
    }
    public static CustomerResponseDTO entityToDto(Customer customer) {
        return new CustomerResponseDTO(customer.getId(), customer.getName(), customer.getEmail());
    }
}
