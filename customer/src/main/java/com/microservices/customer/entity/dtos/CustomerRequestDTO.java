package com.microservices.customer.entity.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class CustomerRequestDTO {
    private String name;
    private String email;
}
