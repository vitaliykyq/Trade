package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    PurchaseUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.Goods;
import edu.coursework.trade.model.Head;
import edu.coursework.trade.model.Person;
import edu.coursework.trade.model.Purchase;
import edu.coursework.trade.service.Goods.impls.GoodsServiceImpl;
import edu.coursework.trade.service.Purchase.impls.PurchaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/purchase")
@Controller
public class PurchaseUIController {

    @Autowired
    PurchaseServiceImpl purchaseService;

    @Autowired
    GoodsServiceImpl goodsService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Purchase> purchaseList = purchaseService.getAll();
        model.addAttribute("purchaseList", purchaseList);
        return "purchase/purchaseList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Purchase purchase = purchaseService.getById(id);
        model.addAttribute("purchase",purchase);

        List<Goods> goodsListId = goodsService.getAll();
        model.addAttribute("goodsListId", goodsListId);
        return "purchase/updatePurchase";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("purchase") @RequestBody Purchase purchase) {
        purchaseService.update(purchase);
        return "redirect:/ui/purchase/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        Purchase purchase = new Purchase();
        model.addAttribute("purchase", purchase);

        List<Goods> goodsListId = goodsService.getAll();
        model.addAttribute("goodsListId", goodsListId);
        return "purchase/newPurchase";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("purchase") @RequestBody Purchase purchase) {
        model.addAttribute("purchase", purchaseService.create(purchase));
        return "redirect:/ui/purchase/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        purchaseService.delete(id);
        return "redirect:/ui/purchase/get/all";
    }
}
