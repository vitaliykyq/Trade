package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Buyer;
import edu.coursework.trade.service.Buyer.impls.BuyerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/buyers")
public class BuyerRestController {

    @Autowired
    BuyerServiceImpl service;

    @GetMapping("/get/all")
    public List< Buyer> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public  Buyer getById(@PathVariable("id") String id){
        Buyer byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public  Buyer deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public  Buyer create(@RequestBody Buyer buyer){
        return service.create(buyer);
    }

    @PostMapping ("/update/")
    public  Buyer update(@RequestBody Buyer buyer){
        return service.update(buyer);
    }

}
