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
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "order")
public class Order {

    private String id;

    private int orderNumber;
    private List<Goods> goodsList;
    private String deliveryDate;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
