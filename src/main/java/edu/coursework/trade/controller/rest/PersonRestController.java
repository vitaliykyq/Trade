package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Goods;
import edu.coursework.trade.model.Person;
import edu.coursework.trade.service.Person.PersonServiceImpl;
import edu.coursework.trade.service.goods.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/persons")
public class PersonRestController {

    @Autowired
    PersonServiceImpl service;

    @GetMapping("/get/all")
    public List<Person> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Person getById(@PathVariable("id") String id){
        Person byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Person deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Person create(@RequestBody Person person){
        return service.create(person);
    }

    @PostMapping ("/update/")
    public Person update(@RequestBody Person person){
        return service.update(person);
    }

}
