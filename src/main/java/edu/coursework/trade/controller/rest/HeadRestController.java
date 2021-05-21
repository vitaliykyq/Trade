package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    HeadRestController
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Head;
import edu.coursework.trade.service.Head.HeadServiceImpl;
import edu.coursework.trade.service.Head.HeadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/Head/get/all*/
@RestController
@RequestMapping("api/heads")
public class HeadRestController {

    @Autowired
    HeadServiceImpl service;

    @GetMapping("/get/all")
    public List<Head> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Head getById(@PathVariable("id") String id){
        Head byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Head deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Head create(@RequestBody Head head){
        return service.create(head);
    }

    @PostMapping ("/update/")
    public Head update(@RequestBody Head head){
        return service.update(head);
    }

}
