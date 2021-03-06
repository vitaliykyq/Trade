package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    ManagerUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.Manager;
import edu.coursework.trade.model.Order;
import edu.coursework.trade.model.Person;
import edu.coursework.trade.service.Manager.impls.ManagerServiceImpl;
import edu.coursework.trade.service.Order.impls.OrderServiceImpl;
import edu.coursework.trade.service.Person.impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/manager")
@Controller
public class ManagerUIController {

    @Autowired
    ManagerServiceImpl managerService;

    @Autowired
    PersonServiceImpl personService;

    @Autowired
    OrderServiceImpl orderService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Manager> managerList = managerService.getAll();
        model.addAttribute("managerList", managerList);
        return "manager/managerList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Manager manager = managerService.getById(id);
        model.addAttribute("manager",manager);

        List<Person> personListId = personService.getAll();
        model.addAttribute("personListId", personListId);

        List<Order> orderListId = orderService.getAll();
        model.addAttribute("orderListId", orderListId);
        return "manager/updateManager";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("manager") @RequestBody Manager manager) {
        managerService.update(manager);
        return "redirect:/ui/manager/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        Manager manager = new Manager();
        model.addAttribute("manager", manager);

        List<Person> personListId = personService.getAll();
        model.addAttribute("personListId", personListId);

        List<Order> orderListId = orderService.getAll();
        model.addAttribute("orderListId", orderListId);
        return "manager/newManager";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("manager") @RequestBody Manager manager) {
        model.addAttribute("manager", managerService.create(manager));
        return "redirect:/ui/manager/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        managerService.delete(id);
        return "redirect:/ui/manager/get/all";
    }
}
