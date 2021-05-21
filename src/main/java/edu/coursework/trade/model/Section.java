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

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Section {

    private String id;

    private int sectionNumber;
    private Head head;
    private List<Hall> hallList;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Section(String id, int sectionNumber, Head head, List<Hall> hallList) {
        this.id = id;
        this.sectionNumber = sectionNumber;
        this.head = head;
        this.hallList = hallList;
        this.created_at = new Date();
    }
}
