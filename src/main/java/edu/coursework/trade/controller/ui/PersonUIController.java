package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    BrigadeUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.Person;
import edu.coursework.trade.service.Person.impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/person")
@Controller
public class PersonUIController {

    @Autowired
    PersonServiceImpl service;

    @RequestMapping("/get/all")
    public String showAll(Model model){

        List<Person> personList = service.getAll();
        model.addAttribute("personList", personList);

        return "person/personList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Person person = service.getById(id);
        model.addAttribute("person",person);
        return "person/updatePerson";
    }

    @GetMapping("/showNewForm")
    public String showNewForm(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "person/newPerson";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("person") @RequestBody Person person) {
        model.addAttribute("person", service.create(person));
        return "redirect:/ui/person/get/all";
    }

    /*private boolean checkValue(String value){
        return  (value.length() > 0 && value != null);
    }

    private boolean checkValue(int value){
        return value > 0;
    }*/

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("person") @RequestBody Person person) {
        service.update(person);
        return "redirect:/ui/person/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        service.delete(id);
        return "redirect:/ui/person/get/all";
    }
}
