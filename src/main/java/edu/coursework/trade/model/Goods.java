package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Goods 
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

public class Goods {

    private String id;

    private String kind;
    private double price;
    private int amount;
    private LocalDateTime dateOfManufacture;
    private LocalDateTime expirationDate;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Goods(String id, String kind, double price, int amount,
                 LocalDateTime dateOfManufacture, LocalDateTime expirationDate) {
        this.id = id;
        this.kind = kind;
        this.price = price;
        this.amount = amount;
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
        this.created_at = new Date();
    }
}
