package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Utility;
import edu.coursework.trade.service.Utility.UtilityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/utilities")
public class UtilityRestController {

    @Autowired
    UtilityServiceImpl service;

    @GetMapping("/get/all")
    public List<Utility> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Utility getById(@PathVariable("id") String id){
        Utility byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Utility deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Utility create(@RequestBody Utility utility){
        return service.create(utility);
    }

    @PostMapping ("/update/")
    public Utility update(@RequestBody Utility utility){
        return service.update(utility);
    }

}
