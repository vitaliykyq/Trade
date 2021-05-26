package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Order;
import edu.coursework.trade.service.Order.impls.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/orders")
public class OrderRestController {

    @Autowired
    OrderServiceImpl service;

    @GetMapping("/get/all")
    public List<Order> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Order getById(@PathVariable("id") String id){
        Order byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Order deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Order create(@RequestBody Order order){
        return service.create(order);
    }

    @PostMapping ("/update/")
    public Order update(@RequestBody Order order){
        return service.update(order);
    }

}
