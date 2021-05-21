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

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Manager {

    private String id;

    private Person person;
    private List<Order> orderList;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Manager(String id, Person person, List<Order> orderList) {
        this.id = id;
        this.person = person;
        this.orderList = orderList;
        this.created_at = new Date(
        );
    }
}
