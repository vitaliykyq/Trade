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
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "hall")
public class Hall {

    private String id;

    private int hallNumber;
    private List<Seller> sellerList;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
