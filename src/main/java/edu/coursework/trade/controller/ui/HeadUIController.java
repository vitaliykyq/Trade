package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    HeadUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.Head;
import edu.coursework.trade.model.Person;
import edu.coursework.trade.service.Head.impls.HeadServiceImpl;
import edu.coursework.trade.service.Person.impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/head")
@Controller
public class HeadUIController {

    @Autowired
    HeadServiceImpl headService;

    @Autowired
    PersonServiceImpl personService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Head> head = headService.getAll();
        model.addAttribute("headList", head);
        return "head/headList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Head head = headService.getById(id);
        model.addAttribute("head",head);

        List<Person> personListId = personService.getAll();
        model.addAttribute("personListId", personListId);
        return "head/updateHead";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("head") @RequestBody Head head) {
        head.setPerson(personService.getById(head.getPerson().getId()));
        headService.update(head);
        return "redirect:/ui/head/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        Head head = new Head();
        model.addAttribute("head", head);

        List<Person> personListId = personService.getAll();
        model.addAttribute("personListId", personListId);
        return "head/newHead";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("head") @RequestBody Head head) {

        head.setPerson(personService.getById(head.getPerson().getId()));
        model.addAttribute("head", headService.create(head));
        return "redirect:/ui/head/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        headService.delete(id);
        return "redirect:/ui/head/get/all";
    }
}