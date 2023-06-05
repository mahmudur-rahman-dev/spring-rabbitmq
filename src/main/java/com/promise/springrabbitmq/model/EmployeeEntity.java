package com.promise.springrabbitmq.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "employee")
@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;
}
