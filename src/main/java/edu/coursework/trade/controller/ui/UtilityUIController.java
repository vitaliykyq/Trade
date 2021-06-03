package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    UtilityUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.Utility;
import edu.coursework.trade.service.Utility.impls.UtilityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/utility")
@Controller
public class UtilityUIController {

    @Autowired
    UtilityServiceImpl utilityService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Utility> utilityList = utilityService.getAll();
        model.addAttribute("utilityList", utilityList);
        return "utility/utilityList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Utility utility = utilityService.getById(id);
        model.addAttribute("utility", utility);
        return "utility/updateUtility";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("utility") @RequestBody Utility utility) {
        utilityService.update(utility);
        return "redirect:/ui/utility/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        Utility utility = new Utility();
        model.addAttribute("utility", utility);
        return "utility/newUtility";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("utility") @RequestBody Utility utility) {
        model.addAttribute("utility", utilityService.create(utility));
        return "redirect:/ui/utility/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        utilityService.delete(id);
        return "redirect:/ui/utility/get/all";
    }
}
