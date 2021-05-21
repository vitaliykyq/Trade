package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Utilities 
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

public class Utility {

    private String id;

    private int price;
    private LocalDateTime month;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Utility(String id, int price, LocalDateTime month) {
        this.id = id;
        this.price = price;
        this.month = month;
        this.created_at = new Date();
    }
}
