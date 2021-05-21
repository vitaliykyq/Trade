package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Kiosk 
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

public class Kiosk {

    private String id;

    private List<Head> headList;
    private Manager manager;
    private List<Seller> sellerList;
    private List<Buyer> buyerList;
    private Directory directory;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Kiosk(String id, List<Head> headList, Manager manager,
                 List<Seller> sellerList, List<Buyer> buyerList, Directory directory) {
        this.id = id;
        this.headList = headList;
        this.manager = manager;
        this.sellerList = sellerList;
        this.buyerList = buyerList;
        this.directory = directory;
        this.created_at = new Date();
    }
}
