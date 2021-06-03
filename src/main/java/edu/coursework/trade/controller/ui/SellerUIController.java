package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    SellerUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.Buyer;
import edu.coursework.trade.model.Person;
import edu.coursework.trade.model.Seller;
import edu.coursework.trade.service.Buyer.impls.BuyerServiceImpl;
import edu.coursework.trade.service.Person.impls.PersonServiceImpl;
import edu.coursework.trade.service.Seller.impls.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/seller")
@Controller
public class SellerUIController {

    @Autowired
    SellerServiceImpl sellerService;

    @Autowired
    PersonServiceImpl personService;

    @Autowired
    BuyerServiceImpl buyerService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Seller> sellerList = sellerService.getAll();
        model.addAttribute("sellerList", sellerList);
        return "seller/sellerList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Seller seller = sellerService.getById(id);
        model.addAttribute("seller", seller);

        List<Person> personListId = personService.getAll();
        model.addAttribute("buyerList", personListId);

        List<Buyer> buyerListId = buyerService.getAll();
        model.addAttribute("buyerListId", buyerListId);
        return "seller/updateSeller";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("seller") @RequestBody Seller seller) {
        sellerService.update(seller);
        return "redirect:/ui/seller/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        Seller seller = new Seller();
        model.addAttribute("seller", seller);

        List<Person> personListId = personService.getAll();
        model.addAttribute("personListId", personListId);

        List<Buyer> buyerListId = buyerService.getAll();
        model.addAttribute("buyerListId", buyerListId);
        return "seller/newSeller";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("seller") @RequestBody Seller seller) {
        model.addAttribute("seller", sellerService.create(seller));
        return "redirect:/ui/seller/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        sellerService.delete(id);
        return "redirect:/ui/seller/get/all";
    }
}
