package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Person 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "person")
public class Person {
    @Id
    private String id;

    private String firstName;
    private String secondName;
    private int age;
    private String gender;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
