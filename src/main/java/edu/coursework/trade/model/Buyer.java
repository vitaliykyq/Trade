package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Buyer 
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

public class Buyer {

    private String id;

    private Person person;
    private List<Purchase> purchaseList;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Buyer(String id, Person person, List<Purchase> purchaseList) {
        this.id = id;
        this.person = person;
        this.purchaseList = purchaseList;
        this.created_at = new Date();
    }
}
