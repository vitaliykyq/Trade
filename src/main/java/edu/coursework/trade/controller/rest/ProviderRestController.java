package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.Provider;
import edu.coursework.trade.service.Provider.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/providers")
public class ProviderRestController {

    @Autowired
    ProviderServiceImpl service;

    @GetMapping("/get/all")
    public List<Provider> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public Provider getById(@PathVariable("id") String id){
        Provider byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public Provider deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public Provider create(@RequestBody Provider provider){
        return service.create(provider);
    }

    @PostMapping ("/update/")
    public Provider update(@RequestBody Provider provider){
        return service.update(provider);
    }

}
