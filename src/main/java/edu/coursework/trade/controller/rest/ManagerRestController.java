package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Goods;
import edu.coursework.trade.model.Manager;
import edu.coursework.trade.service.Manager.ManagerServiceImpl;
import edu.coursework.trade.service.goods.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/managers")
public class ManagerRestController {

    @Autowired
    ManagerServiceImpl service;

    @GetMapping("/get/all")
    public List<Manager> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Manager getById(@PathVariable("id") String id){
        Manager byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Manager deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Manager create(@RequestBody Manager manager){
        return service.create(manager);
    }

    @PostMapping ("/update/")
    public Manager update(@RequestBody Manager manager){
        return service.update(manager);
    }

}
