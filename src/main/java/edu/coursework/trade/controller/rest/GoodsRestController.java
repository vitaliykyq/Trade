package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Goods;
import edu.coursework.trade.service.Goods.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/goods")
public class GoodsRestController {

    @Autowired
    GoodsServiceImpl service;

    @GetMapping("/get/all")
    public List<Goods> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Goods getById(@PathVariable("id") String id){
        Goods byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Goods deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Goods create(@RequestBody Goods goods){
        return service.create(goods);
    }

    @PostMapping ("/update/")
    public Goods update(@RequestBody Goods goods){
        return service.update(goods);
    }

}
