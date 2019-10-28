package com.launchcode.cheesemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("cheese")
public class CheeseController {

    static ArrayList<String> cheeses = new ArrayList<>();

    @RequestMapping("")
    public String index(Model model) {

        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "My Cheeses");

        return "cheese/index";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String create(Model model) {

        model.addAttribute("title", "Create");

        return "cheese/create";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String store(@RequestParam String name) {

        cheeses.add(name);

        return "redirect:";
    }
}
