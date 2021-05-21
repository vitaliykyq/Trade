package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Hall 
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

public class Hall {

    private String id;

    private int hallNumber;
    private List<Seller> sellerList;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Hall(String id, int hallNumber, List<Seller> sellerList) {
        this.id = id;
        this.hallNumber = hallNumber;
        this.sellerList = sellerList;
        this.created_at = new Date();
    }
}
