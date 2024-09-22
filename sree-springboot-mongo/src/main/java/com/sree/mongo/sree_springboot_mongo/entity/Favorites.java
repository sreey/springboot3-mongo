package com.sree.mongo.sree_springboot_mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Favorites {
    
    private String movie;
    private String lang;

}
