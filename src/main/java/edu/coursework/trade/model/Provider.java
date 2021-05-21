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

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Provider {

    private String id;

    private String name;
    private LocalDateTime startCooperation;
    private LocalDateTime finishCooperation;
    private Manager manager;

    private Date created_at;
    private Date modified_at;
    private String description;

    public Provider(String id, String name, LocalDateTime startCooperation,
                    LocalDateTime finishCooperation, Manager manager) {
        this.id = id;
        this.name = name;
        this.startCooperation = startCooperation;
        this.finishCooperation = finishCooperation;
        this.manager = manager;
        this.created_at = new Date();
    }
}
