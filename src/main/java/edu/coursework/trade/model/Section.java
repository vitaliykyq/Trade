package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Section 
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
@Document(collection = "section")
public class Section {

    private String id;

    private int sectionNumber;
    private Head head;
    private List<Hall> hallList;

    private Date createdAt;
    private Date modifiedAt;
    private String description;
}
