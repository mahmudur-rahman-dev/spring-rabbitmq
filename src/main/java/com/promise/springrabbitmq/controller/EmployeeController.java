package com.promise.springrabbitmq.controller;

import com.promise.springrabbitmq.model.EmployeeEntity;
import com.promise.springrabbitmq.model.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    private final EmployeeRepo repo;

    @GetMapping(path = "/")
    public ResponseEntity<EmployeeEntity> insertData() {
        var entity = EmployeeEntity.builder()
                .address("Bashundhara Residential Area")
                .name("Mahmudur Rahman Promise")
                .build();
        return ResponseEntity.ok(repo.save(entity));
    }
}
