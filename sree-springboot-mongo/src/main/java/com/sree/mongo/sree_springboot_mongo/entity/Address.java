package com.sree.mongo.sree_springboot_mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Address {
    
    private String street;
    private String city;
    private String state;
}
