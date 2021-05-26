package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Manager 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "manager")
public class Manager {

    private String id;

    private Person person;
    private List<Order> orderList;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
