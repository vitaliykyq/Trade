package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    Head 
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

public class Head {

    private String id;

    private Person person;

    private Date created_at;
    private Date modified_at;
    private String description;
}
