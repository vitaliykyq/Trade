package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    ShopUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.*;
import edu.coursework.trade.service.Buyer.impls.BuyerServiceImpl;
import edu.coursework.trade.service.Directory.impls.DirectoryServiceImpl;
import edu.coursework.trade.service.Hall.impls.HallServiceImpl;
import edu.coursework.trade.service.Head.impls.HeadServiceImpl;
import edu.coursework.trade.service.Manager.impls.ManagerServiceImpl;
import edu.coursework.trade.service.Shop.impls.ShopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/shop")
@Controller
public class ShopUIController {

    @Autowired
    ShopServiceImpl shopService;

    @Autowired
    HeadServiceImpl headService;

    @Autowired
    ManagerServiceImpl managerService;

    @Autowired
    BuyerServiceImpl buyerService;

    @Autowired
    DirectoryServiceImpl directoryService;

    @Autowired
    HallServiceImpl hallService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Shop> shopList = shopService.getAll();
        model.addAttribute("shopList", shopList);
        return "shop/shopList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Shop shop = shopService.getById(id);
        model.addAttribute("shop", shop);

        List<Head> headListId = headService.getAll();
        model.addAttribute("headListId", headListId);

        List<Manager> managerListId = managerService.getAll();
        model.addAttribute("managerListId", managerListId);

        List<Buyer> buyerListId = buyerService.getAll();
        model.addAttribute("buyerListId", buyerListId);

        List<Directory> directoryListId = directoryService.getAll();
        model.addAttribute("directoryListId", directoryListId);

        List<Hall> hallListId = hallService.getAll();
        model.addAttribute("hallListId", hallListId);
        return "shop/updateShop";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("shop") @RequestBody Shop shop) {
        shopService.update(shop);
        return "redirect:/ui/shop/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        Shop shop = new Shop();
        model.addAttribute("shop", shop);

        List<Head> headListId = headService.getAll();
        model.addAttribute("headListId", headListId);

        List<Manager> managerListId = managerService.getAll();
        model.addAttribute("managerListId", managerListId);

        List<Buyer> buyerListId = buyerService.getAll();
        model.addAttribute("buyerListId", buyerListId);

        List<Directory> directoryListId = directoryService.getAll();
        model.addAttribute("directoryListId", directoryListId);

        List<Hall> hallListId = hallService.getAll();
        model.addAttribute("hallListId", hallListId);
        return "shop/newShop";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("shop") @RequestBody Shop shop) {
        model.addAttribute("shop", shopService.create(shop));
        return "redirect:/ui/shop/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        shopService.delete(id);
        return "redirect:/ui/shop/get/all";
    }
}