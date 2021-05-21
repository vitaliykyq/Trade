package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Tray 
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

public class Tray {

    private String id;

    private Head head;
    private Manager manager;
    private List<Buyer> buyerList;
    private List<Seller> sellerList;
    private Directory directory;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Tray(String id, Head head, Manager manager, List<Buyer> buyerList,
                List<Seller> sellerList, Directory directory) {
        this.id = id;
        this.head = head;
        this.manager = manager;
        this.buyerList = buyerList;
        this.sellerList = sellerList;
        this.directory = directory;
        this.created_at = new Date();
    }
}
