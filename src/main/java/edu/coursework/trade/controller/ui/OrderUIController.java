package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    OrderUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.Goods;
import edu.coursework.trade.model.Order;
import edu.coursework.trade.service.Goods.impls.GoodsServiceImpl;
import edu.coursework.trade.service.Order.impls.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/order")
@Controller
public class OrderUIController {

    @Autowired
    OrderServiceImpl orderService;

    @Autowired
    GoodsServiceImpl goodsService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Order> orderList = orderService.getAll();
        model.addAttribute("orderList", orderList);
        return "order/orderList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Order order = orderService.getById(id);
        model.addAttribute("order", order);

        List<Goods> goodsListId = goodsService.getAll();
        model.addAttribute("goodsListId", goodsListId);
        return "order/updateOrder";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("order") @RequestBody Order order) {
        orderService.update(order);
        return "redirect:/ui/order/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        Order order = new Order();
        model.addAttribute("order", order);

        List<Goods> goodsListId = goodsService.getAll();
        model.addAttribute("goodsListId", goodsListId);
        return "order/newOrder";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("order") @RequestBody Order order) {
        model.addAttribute("order", orderService.create(order));
        return "redirect:/ui/order/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        orderService.delete(id);
        return "redirect:/ui/order/get/all";
    }
}