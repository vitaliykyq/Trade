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
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "directory")
public class Directory {

    private String id;

    private List<Goods> goodsList;
    private List<Goods> spoiledList;
    private List<Utility> utilityList;
    private double rentalPrice;
    private double retailSpace;
    private int numberOfCounters;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
