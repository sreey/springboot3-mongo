package com.sree.mongo.sree_springboot_mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "user")
@Getter
@Setter
@AllArgsConstructor(onConstructor=@__({@PersistenceCreator})) //if there are more than one constructor we can use @persistencecreator annotation
@NoArgsConstructor
public class User {

    @Id
    private String id;

    @DBRef
    private Student student;

    
}
