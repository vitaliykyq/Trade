package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Tray 
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
@Document(collection = "tray")
public class Tray {

    private String id;

    private Head head;
    private Manager manager;
    private List<Buyer> buyerList;
    private List<Seller> sellerList;
    private Directory directory;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
