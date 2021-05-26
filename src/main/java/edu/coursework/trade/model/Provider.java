package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Provider 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "provider")
public class Provider {

    private String id;

    private String name;
    private LocalDateTime startCooperation;
    private LocalDateTime finishCooperation;
    private Manager manager;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
