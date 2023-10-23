package com.example.springbootcustomermanagement.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data     //Annotation @Data của Lombok đã hỗ trợ phần tạo constructor và các phương thức getter / setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
}
