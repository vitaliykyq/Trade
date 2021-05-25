package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Hall;
import edu.coursework.trade.service.Hall.HallServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/halls")
public class HallRestController {

    @Autowired
    HallServiceImpl service;

    @GetMapping("/get/all")
    public List<Hall> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Hall getById(@PathVariable("id") String id){
        Hall byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Hall deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Hall create(@RequestBody Hall hall){
        return service.create(hall);
    }

    @PostMapping ("/update/")
    public Hall update(@RequestBody Hall hall){
        return service.update(hall);
    }

}
