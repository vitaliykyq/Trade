package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Section;
import edu.coursework.trade.service.Section.impls.SectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/sections")
public class SectionRestController {

    @Autowired
    SectionServiceImpl service;

    @GetMapping("/get/all")
    public List<Section> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Section getById(@PathVariable("id") String id){
        Section byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Section deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Section create(@RequestBody Section section){
        return service.create(section);
    }

    @PostMapping ("/update/")
    public Section update(@RequestBody Section section){
        return service.update(section);
    }

}
