package com.microservices.customer.entity.dtos;

import com.microservices.customer.entity.Customer;
import lombok.Data;

import java.util.List;

@Data
public class getListCustomerDTO {
    private List<CustomerResponseDTO> customers;
}
