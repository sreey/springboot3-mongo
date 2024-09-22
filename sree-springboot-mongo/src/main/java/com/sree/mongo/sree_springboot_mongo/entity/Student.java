package com.sree.mongo.sree_springboot_mongo.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "student")
@Getter
@Setter
@AllArgsConstructor(onConstructor=@__({@PersistenceCreator})) //if there are more than one constructor we can use @persistencecreator annotation
@NoArgsConstructor
public class Student {
    
    @Id
    private String id;

    @Field(name="name")  //if the java field name and document field name are same you don't have to provide the field annotation.
    private String name;

    private Integer age;

    private Address address;

    private List<Favorites> favorites;
    
}
