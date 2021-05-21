package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Purchase 
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

public class Purchase {

    private String id;

    private LocalDateTime dateOfPurchase;
    private List<Goods> goodsList;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Purchase(String id, LocalDateTime dateOfPurchase, List<Goods> goodsList) {
        this.id = id;
        this.dateOfPurchase = dateOfPurchase;
        this.goodsList = goodsList;
        this.created_at = new Date();
    }
}
