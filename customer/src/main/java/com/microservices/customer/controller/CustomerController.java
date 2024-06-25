package com.microservices.customer.controller;

import com.microservices.customer.entity.dtos.CustomerRequestDTO;
import com.microservices.customer.entity.dtos.CustomerResponseDTO;
import com.microservices.customer.service.Interfaces.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final ICustomerService customerService;

    @PostMapping("/")
    public ResponseEntity<?> index(@RequestBody CustomerRequestDTO customer) {
        customerService.save(customer);
        return ResponseEntity.ok().body("Customer added sucesfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") String id) {
        CustomerResponseDTO customerResponseDTO = customerService.findById(id);
        return ResponseEntity.ok().body(customerResponseDTO);
    }
}
