package edu.coursework.trade.controller.rest;

/*
    @author:    Anton
    @project:    Trade 
    @class:    GoodsRestController 
    @version:    1.0.0 
    @since:    15.04.2021     
*/

import edu.coursework.trade.model.DepartmentStore;
import edu.coursework.trade.service.DepartmentStore.DepartmentStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*http://localhost:8080/api/goods/get/all*/
@RestController
@RequestMapping("api/departmentStores")
public class DepartmentStoreRestController {

    @Autowired
    DepartmentStoreServiceImpl service;

    @GetMapping("/get/all")
    public List<DepartmentStore> getCivil(){
        return service.getAll() ;
    }

    @GetMapping("/get/{id}")
    public DepartmentStore getById(@PathVariable("id") String id){
        DepartmentStore byId = service.getById(id);
        return byId;
    }

    @GetMapping("/delete/{id}")
    public DepartmentStore deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping("/create/")
    public DepartmentStore create(@RequestBody DepartmentStore store){
        return service.create(store);
    }

    @PostMapping ("/update/")
    public DepartmentStore update(@RequestBody DepartmentStore store){
        return service.update(store);
    }

}
