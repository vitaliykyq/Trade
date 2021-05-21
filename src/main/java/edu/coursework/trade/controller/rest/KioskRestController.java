package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Goods;
import edu.coursework.trade.model.Kiosk;
import edu.coursework.trade.service.Kiosk.KioskServiceImpl;
import edu.coursework.trade.service.goods.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/kiosks")
public class KioskRestController {

    @Autowired
    KioskServiceImpl service;

    @GetMapping("/get/all")
    public List<Kiosk> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Kiosk getById(@PathVariable("id") String id){
        Kiosk byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Kiosk deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Kiosk create(@RequestBody Kiosk kiosk){
        return service.create(kiosk);
    }

    @PostMapping ("/update/")
    public Kiosk update(@RequestBody Kiosk kiosk){
        return service.update(kiosk);
    }

}
