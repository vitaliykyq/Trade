package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Goods;
import edu.coursework.trade.model.Tray;
import edu.coursework.trade.service.Tray.TrayServiceImpl;
import edu.coursework.trade.service.goods.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/trays")
public class TrayRestController {

    @Autowired
    TrayServiceImpl service;

    @GetMapping("/get/all")
    public List<Tray> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Tray getById(@PathVariable("id") String id){
        Tray byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Tray deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Tray create(@RequestBody Tray tray){
        return service.create(tray);
    }

    @PostMapping ("/update/")
    public Tray update(@RequestBody Tray tray){
        return service.update(tray);
    }

}
