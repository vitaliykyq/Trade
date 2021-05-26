package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Shop 
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
@Document(collection = "shop")
public class Shop {

    private String id;

    private Head head;
    private Manager manager;
    private List<Buyer> buyerList;
    private Directory directory;
    private List<Hall> hallList;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
