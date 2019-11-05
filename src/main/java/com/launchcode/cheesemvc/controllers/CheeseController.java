package com.launchcode.cheesemvc.controllers;

import com.launchcode.cheesemvc.models.Cheese;
import com.launchcode.cheesemvc.models.CheeseType;
import com.launchcode.cheesemvc.repositories.CheeseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("cheese")
public class CheeseController {

    @Autowired
    CheeseRepository repository;

    @RequestMapping("")
    public String index(Model model) {

        model.addAttribute("cheeses", repository.findAll());
        model.addAttribute("title", "My Cheeses");

        return "cheese/index";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String create(Model model) {

        model.addAttribute("title", "Create");
        model.addAttribute(new Cheese());
        model.addAttribute("cheeseTypes", CheeseType.values());
        return "cheese/create";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String store(
            @ModelAttribute Cheese cheese,
            Model model
            ) {

        repository.save(cheese);

        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String remove(Model model) {
        model.addAttribute("cheeses", repository.findAll());
        model.addAttribute("title", "Remove cheese");

        return "cheese/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemove(@RequestParam int[] cheeseIds) {
        for(int cheeseId : cheeseIds) {
            repository.deleteById(cheeseId);
        }
        return "redirect:";
    }


}
