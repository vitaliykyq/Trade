package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Directory 
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

public class Directory {

    private String id;

    private List<Goods> goodsList;
    private List<Goods> spoiledList;
    private List<Utility> utilityList;
    private double rentalPrice;
    private double retailSpace;
    private int numberOfCounters;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Directory(String id, List<Goods> goodsList, List<Goods> spoiledList,
                     List<Utility> utilityList, double rentalPrice, double retailSpace, int numberOfCounters) {
        this.id = id;
        this.goodsList = goodsList;
        this.spoiledList = spoiledList;
        this.utilityList = utilityList;
        this.rentalPrice = rentalPrice;
        this.retailSpace = retailSpace;
        this.numberOfCounters = numberOfCounters;
        this.created_at = new Date();
    }
}
