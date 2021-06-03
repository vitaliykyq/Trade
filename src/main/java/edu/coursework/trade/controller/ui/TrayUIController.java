package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    TrayUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.*;
import edu.coursework.trade.service.Buyer.impls.BuyerServiceImpl;
import edu.coursework.trade.service.Directory.impls.DirectoryServiceImpl;
import edu.coursework.trade.service.Head.impls.HeadServiceImpl;
import edu.coursework.trade.service.Manager.impls.ManagerServiceImpl;
import edu.coursework.trade.service.Seller.impls.SellerServiceImpl;
import edu.coursework.trade.service.Tray.impls.TrayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/tray")
@Controller
public class TrayUIController {

    @Autowired
    TrayServiceImpl trayService;

    @Autowired
    HeadServiceImpl headService;

    @Autowired
    ManagerServiceImpl managerService;

    @Autowired
    BuyerServiceImpl buyerService;

    @Autowired
    DirectoryServiceImpl directoryService;

    @Autowired
    SellerServiceImpl sellerService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Tray> trayList = trayService.getAll();
        model.addAttribute("trayList", trayList);
        return "tray/trayList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Tray tray = trayService.getById(id);
        model.addAttribute("tray", tray);

        List<Head> headListId = headService.getAll();
        model.addAttribute("headListId", headListId);

        List<Manager> managerListId = managerService.getAll();
        model.addAttribute("managerListId", managerListId);

        List<Buyer> buyerListId = buyerService.getAll();
        model.addAttribute("buyerListId", buyerListId);

        List<Directory> directoryListId = directoryService.getAll();
        model.addAttribute("directoryListId", directoryListId);

        List<Seller> sellerListId = sellerService.getAll();
        model.addAttribute("sellerListId", sellerListId);
        return "tray/updateTray";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("tray") @RequestBody Tray tray) {
        trayService.update(tray);
        return "redirect:/ui/tray/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        Tray tray = new Tray();
        model.addAttribute("tray", tray);

        List<Head> headListId = headService.getAll();
        model.addAttribute("headListId", headListId);

        List<Manager> managerListId = managerService.getAll();
        model.addAttribute("managerListId", managerListId);

        List<Buyer> buyerListId = buyerService.getAll();
        model.addAttribute("buyerListId", buyerListId);

        List<Directory> directoryListId = directoryService.getAll();
        model.addAttribute("directoryListId", directoryListId);

        List<Seller> sellerListId = sellerService.getAll();
        model.addAttribute("sellerListId", sellerListId);
        return "tray/newTray";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("tray") @RequestBody Tray tray) {
        model.addAttribute("tray", trayService.create(tray));
        return "redirect:/ui/tray/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        trayService.delete(id);
        return "redirect:/ui/tray/get/all";
    }
}