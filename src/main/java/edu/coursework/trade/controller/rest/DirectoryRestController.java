package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Directory;
import edu.coursework.trade.service.Directory.impls.DirectoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/directory")
public class DirectoryRestController {

    @Autowired
    DirectoryServiceImpl service;

    @GetMapping("/get/all")
    public List<Directory> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Directory getById(@PathVariable("id") String id){
        Directory byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Directory deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Directory create(@RequestBody Directory directory){
        return service.create(directory);
    }

    @PostMapping ("/update/")
    public Directory update(@RequestBody Directory directory){
        return service.update(directory);
    }

}
