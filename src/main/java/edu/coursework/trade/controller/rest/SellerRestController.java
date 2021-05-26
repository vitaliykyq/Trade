package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Seller;
import edu.coursework.trade.service.Seller.impls.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/sellers")
public class SellerRestController {

    @Autowired
    SellerServiceImpl service;

    @GetMapping("/get/all")
    public List<Seller> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Seller getById(@PathVariable("id") String id){
        Seller byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Seller deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Seller create(@RequestBody Seller seller){
        return service.create(seller);
    }

    @PostMapping ("/update/")
    public Seller update(@RequestBody Seller seller){
        return service.update(seller);
    }

}
