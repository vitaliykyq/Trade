package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    DepartmentStoreUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.*;
import edu.coursework.trade.service.Buyer.impls.BuyerServiceImpl;
import edu.coursework.trade.service.DepartmentStore.impls.DepartmentStoreServiceImpl;
import edu.coursework.trade.service.Directory.impls.DirectoryServiceImpl;
import edu.coursework.trade.service.Head.impls.HeadServiceImpl;
import edu.coursework.trade.service.Manager.impls.ManagerServiceImpl;
import edu.coursework.trade.service.Section.impls.SectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/departmentStore")
@Controller
public class DepartmentStoreUIController {

    @Autowired
    DepartmentStoreServiceImpl departmentStoreService;

    @Autowired
    HeadServiceImpl headService;

    @Autowired
    ManagerServiceImpl managerService;

    @Autowired
    BuyerServiceImpl buyerService;

    @Autowired
    DirectoryServiceImpl directoryService;

    @Autowired
    SectionServiceImpl sectionService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<DepartmentStore> departmentStoreList = departmentStoreService.getAll();
        model.addAttribute("departmentStoreList", departmentStoreList);
        return "departmentStore/departmentStoreList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        DepartmentStore departmentStore = departmentStoreService.getById(id);
        model.addAttribute("departmentStore", departmentStore);

        List<Head> headListId = headService.getAll();
        model.addAttribute("headListId", headListId);

        List<Manager> managerListId = managerService.getAll();
        model.addAttribute("managerListId", managerListId);

        List<Buyer> buyerListId = buyerService.getAll();
        model.addAttribute("buyerListId", buyerListId);

        List<Directory> directoryListId = directoryService.getAll();
        model.addAttribute("directoryListId", directoryListId);

        List<Section> sectionListId = sectionService.getAll();
        model.addAttribute("sectionListId", sectionListId);
        return "departmentStore/updateDepartmentStore";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("departmentStore") @RequestBody DepartmentStore departmentStore) {
        departmentStoreService.update(departmentStore);
        return "redirect:/ui/departmentStore/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        DepartmentStore departmentStore = new DepartmentStore();
        model.addAttribute("departmentStore", departmentStore);

        List<Head> headListId = headService.getAll();
        model.addAttribute("headListId", headListId);

        List<Manager> managerListId = managerService.getAll();
        model.addAttribute("managerListId", managerListId);

        List<Buyer> buyerListId = buyerService.getAll();
        model.addAttribute("buyerListId", buyerListId);

        List<Directory> directoryListId = directoryService.getAll();
        model.addAttribute("directoryListId", directoryListId);

        List<Section> sectionListId = sectionService.getAll();
        model.addAttribute("sectionListId", sectionListId);
        return "departmentStore/newDepartmentStore";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("departmentStore") @RequestBody DepartmentStore departmentStore) {
        model.addAttribute("departmentStore", departmentStoreService.create(departmentStore));
        return "redirect:/ui/departmentStore/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        departmentStoreService.delete(id);
        return "redirect:/ui/departmentStore/get/all";
    }
}