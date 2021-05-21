package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Shop 
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

public class Shop {

    private String id;

    private Head head;
    private Manager manager;
    private List<Buyer> buyerList;
    private Directory directory;
    private List<Hall> hallList;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Shop(String id, Head head, Manager manager,
                List<Buyer> buyerList, Directory directory, List<Hall> hallList) {
        this.id = id;
        this.head = head;
        this.manager = manager;
        this.buyerList = buyerList;
        this.directory = directory;
        this.hallList = hallList;
        this.created_at = new Date();
    }
}
