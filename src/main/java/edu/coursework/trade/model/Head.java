package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Head 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "head")
public class Head {
    @Id
    private String id;

    private Person person;
    private double experience;
    private String dateStart;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
