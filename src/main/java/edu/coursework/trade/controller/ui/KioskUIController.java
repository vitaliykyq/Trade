package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    KioskUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.*;
import edu.coursework.trade.service.Buyer.impls.BuyerServiceImpl;
import edu.coursework.trade.service.Directory.impls.DirectoryServiceImpl;
import edu.coursework.trade.service.Head.impls.HeadServiceImpl;
import edu.coursework.trade.service.Kiosk.impls.KioskServiceImpl;
import edu.coursework.trade.service.Manager.impls.ManagerServiceImpl;
import edu.coursework.trade.service.Seller.impls.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/kiosk")
@Controller
public class KioskUIController {

    @Autowired
    KioskServiceImpl kioskService;

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
        List<Kiosk> kioskList = kioskService.getAll();
        model.addAttribute("kioskList", kioskList);
        return "kiosk/kioskList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Kiosk kiosk = kioskService.getById(id);
        model.addAttribute("kiosk", kiosk);

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
        return "kiosk/updateKiosk";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("kiosk") @RequestBody Kiosk kiosk) {
        kioskService.update(kiosk);
        return "redirect:/ui/kiosk/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        Kiosk kiosk = new Kiosk();
        model.addAttribute("kiosk", kiosk);

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
        return "kiosk/newKiosk";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("kiosk") @RequestBody Kiosk kiosk) {
        model.addAttribute("kiosk", kioskService.create(kiosk));
        return "redirect:/ui/kiosk/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        kioskService.delete(id);
        return "redirect:/ui/kiosk/get/all";
    }
}