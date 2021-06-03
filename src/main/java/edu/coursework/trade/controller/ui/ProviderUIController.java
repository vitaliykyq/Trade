package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    ProviderUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.Manager;
import edu.coursework.trade.model.Provider;
import edu.coursework.trade.service.Manager.impls.ManagerServiceImpl;
import edu.coursework.trade.service.Provider.impls.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/provider")
@Controller
public class ProviderUIController {

    @Autowired
    ProviderServiceImpl providerService;

    @Autowired
    ManagerServiceImpl managerService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Provider> providerList = providerService.getAll();
        model.addAttribute("providerList", providerList);
        return "provider/providerList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Provider provider = providerService.getById(id);
        model.addAttribute("provider",provider);

        List<Manager> managerListId = managerService.getAll();
        model.addAttribute("managerListId", managerListId);
        return "provider/updateProvider";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("provider") @RequestBody Provider provider) {
        providerService.update(provider);
        return "redirect:/ui/provider/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        Provider provider = new Provider();
        model.addAttribute("provider", provider);

        List<Manager> managerListId = managerService.getAll();
        model.addAttribute("managerListId", managerListId);
        return "provider/newProvider";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("provider") @RequestBody Provider provider) {
        model.addAttribute("provider", providerService.create(provider));
        return "redirect:/ui/provider/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        providerService.delete(id);
        return "redirect:/ui/provider/get/all";
    }
}