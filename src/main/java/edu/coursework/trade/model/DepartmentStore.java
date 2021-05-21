package edu.coursework.trade.model;

/*
    @author:    Anton
    @project:    Trade 
    @class:    DepartmentStore 
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

public class DepartmentStore {

    private String id;

    private List<Head> headList;
    private Manager manager;
    private List<Buyer> buyerList;
    private Directory directory;
    private List<Section> sectionList;

    private Date created_at;
    private Date modified_at;
    private String description;

    public DepartmentStore(String id, List<Head> headList, Manager manager,
                           List<Buyer> buyerList, Directory directory, List<Section> sectionList) {
        this.id = id;
        this.headList = headList;
        this.manager = manager;
        this.buyerList = buyerList;
        this.directory = directory;
        this.sectionList = sectionList;
        this.created_at = new Date();
    }
}
