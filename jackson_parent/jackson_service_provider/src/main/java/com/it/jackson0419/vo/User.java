package com.it.jackson0419.vo;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "test2")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;
}
