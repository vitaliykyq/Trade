package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Goods;
import edu.coursework.trade.model.Shop;
import edu.coursework.trade.service.Shop.ShopServiceImpl;
import edu.coursework.trade.service.goods.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/shops")
public class ShopRestController {

    @Autowired
    ShopServiceImpl service;

    @GetMapping("/get/all")
    public List<Shop> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Shop getById(@PathVariable("id") String id){
        Shop byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Shop deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Shop create(@RequestBody Shop shop){
        return service.create(shop);
    }

    @PostMapping ("/update/")
    public Shop update(@RequestBody Shop shop){
        return service.update(shop);
    }

}
