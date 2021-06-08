package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    DirectoryUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.*;
import edu.coursework.trade.service.Directory.impls.DirectoryServiceImpl;
import edu.coursework.trade.service.Goods.impls.GoodsServiceImpl;
import edu.coursework.trade.service.Utility.impls.UtilityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/directory")
@Controller
public class DirectoryUIController {

    @Autowired
    DirectoryServiceImpl directoryService;

    @Autowired
    GoodsServiceImpl goodsService;

    @Autowired
    UtilityServiceImpl utilityService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Directory> directoryList = directoryService.getAll();
        model.addAttribute("directoryList", directoryList);
        return "directory/directoryList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Directory directory = directoryService.getById(id);
        model.addAttribute("directory",directory);

        List<Goods> goodsListId = goodsService.getAll();
        model.addAttribute("goodsListId", goodsListId);

        List<Utility> utilityListId = utilityService.getAll();
        model.addAttribute("utilityListId", utilityListId);
        return "directory/updateDirectory";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("directory") @RequestBody Directory directory) {
        directoryService.update(directory);
        return "redirect:/ui/directory/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        Directory directory = new Directory();
        model.addAttribute("directory", directory);

        List<Goods> goodsListId = goodsService.getAll();
        model.addAttribute("goodsListId", goodsListId);

        List<Utility> utilityListId = utilityService.getAll();
        model.addAttribute("utilityListId", utilityListId);
        return "directory/newDirectory";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("directory") @RequestBody Directory directory) {
        model.addAttribute("directory", directoryService.create(directory));
        return "redirect:/ui/directory/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        directoryService.delete(id);
        return "redirect:/ui/directory/get/all";
    }
}