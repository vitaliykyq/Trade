package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Seller 
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

public class Seller {

    private String id;

    private Person person;
    private List<Buyer> buyerList;
    private double salary;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Seller(String id, Person person, List<Buyer> buyerList, double salary) {
        this.id = id;
        this.person = person;
        this.buyerList = buyerList;
        this.salary = salary;
        this.created_at = new Date();
    }
}
