package edu.coursework.trade.service.Directory.interfaces;

/*
    @author:    Anton
    @project:    Trade 
    @class:    IHallService
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Directory;
import edu.coursework.trade.model.Head;

import java.util.List;

public interface IDirectoryService {

    Directory getById(String id);
    Directory create(Directory directory);
    Directory update(Directory directory);
    Directory delete(String id);
    List<Directory> getAll();
}
