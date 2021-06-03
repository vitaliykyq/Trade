package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    HallUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.Hall;
import edu.coursework.trade.model.Seller;
import edu.coursework.trade.service.Hall.impls.HallServiceImpl;
import edu.coursework.trade.service.Seller.impls.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/hall")
@Controller
public class HallUIController {

    @Autowired
    HallServiceImpl hallService;

    @Autowired
    SellerServiceImpl sellerService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Hall> hallList = hallService.getAll();
        model.addAttribute("hallList", hallList);
        return "hall/hallList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Hall hall = hallService.getById(id);
        model.addAttribute("hall", hall);

        List<Seller> sellerListId = sellerService.getAll();
        model.addAttribute("sellerListId", sellerListId);
        return "hall/updateHall";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("hall") @RequestBody Hall hall) {
        hallService.update(hall);
        return "redirect:/ui/hall/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        Hall hall = new Hall();
        model.addAttribute("hall", hall);

        List<Seller> sellerListId = sellerService.getAll();
        model.addAttribute("sellerListId", sellerListId);
        return "hall/newHall";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("hall") @RequestBody Hall hall) {
        model.addAttribute("hall", hallService.create(hall));
        return "redirect:/ui/hall/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        hallService.delete(id);
        return "redirect:/ui/hall/get/all";
    }
}