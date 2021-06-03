package edu.coursework.trade.controller.ui;

/*
    @author:    Anton
    @project:    Trade
    @class:    SectionUIController
    @version:    1.0.0 
    @since:    26.04.2021     
*/

import edu.coursework.trade.model.Hall;
import edu.coursework.trade.model.Head;
import edu.coursework.trade.model.Section;
import edu.coursework.trade.service.Hall.impls.HallServiceImpl;
import edu.coursework.trade.service.Head.impls.HeadServiceImpl;
import edu.coursework.trade.service.Section.impls.SectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ui/section")
@Controller
public class SectionUIController {

    @Autowired
    SectionServiceImpl sectionService;

    @Autowired
    HeadServiceImpl headService;

    @Autowired
    HallServiceImpl hallService;

    @RequestMapping("/get/all")
    public String showAll(Model model){
        List<Section> sectionList = sectionService.getAll();
        model.addAttribute("sectionList", sectionList);
        return "section/sectionList";
    }

    @GetMapping("/showUpdateForm/{id}")
    public String showUpdateForm(@PathVariable (value="id") String id, Model model){
        Section section = sectionService.getById(id);
        model.addAttribute("section",section);

        List<Head> headListId = headService.getAll();
        model.addAttribute("headListId", headListId);

        List<Hall> hallListId = hallService.getAll();
        model.addAttribute("hallListId", hallListId);
        return "section/updateSection";
    }
    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("section") @RequestBody Section section) {
        sectionService.update(section);
        return "redirect:/ui/section/get/all";
    }

    @GetMapping("/showNewForm")
    public String showNewLocomotiveForm(Model model) {
        Section section = new Section();
        model.addAttribute("section", section);

        List<Head> headListId = headService.getAll();
        model.addAttribute("headListId", headListId);

        List<Hall> hallListId = hallService.getAll();
        model.addAttribute("hallListId", hallListId);
        return "section/newSection";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute("section") @RequestBody Section section) {
        model.addAttribute("section", sectionService.create(section));
        return "redirect:/ui/section/get/all";
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        sectionService.delete(id);
        return "redirect:/ui/section/get/all";
    }
}
