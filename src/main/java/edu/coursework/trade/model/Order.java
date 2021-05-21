package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Order 
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

public class Order {

    private String id;

    private int orderNumber;
    private List<Goods> goodsList;
    private LocalDateTime deliveryDate;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Order(String id, int orderNumber, List<Goods> goodsList, LocalDateTime deliveryDate) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.goodsList = goodsList;
        this.deliveryDate = deliveryDate;
        this.created_at = new Date();
    }
}
