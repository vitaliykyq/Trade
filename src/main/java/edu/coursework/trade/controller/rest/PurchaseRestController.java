package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Goods;
import edu.coursework.trade.model.Purchase;
import edu.coursework.trade.service.Purchase.PurchaseServiceImpl;
import edu.coursework.trade.service.goods.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/purchases")
public class PurchaseRestController {

    @Autowired
    PurchaseServiceImpl service;

    @GetMapping("/get/all")
    public List<Purchase> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Purchase getById(@PathVariable("id") String id){
        Purchase byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Purchase deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Purchase create(@RequestBody Purchase purchase){
        return service.create(purchase);
    }

    @PostMapping ("/update/")
    public Purchase update(@RequestBody Purchase purchase){
        return service.update(purchase);
    }

}
