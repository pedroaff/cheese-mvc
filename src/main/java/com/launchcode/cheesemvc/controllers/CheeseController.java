package com.launchcode.cheesemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("cheese")
public class CheeseController {

    @RequestMapping("")
    public String index(Model model) {

        ArrayList<String> cheeses = new ArrayList<>();

        cheeses.add("cheddar");
        cheeses.add("parmesan");
        cheeses.add("gorgonzola");

        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "My Cheeses");

        return "cheese/index";
    }

    @RequestMapping("create")
    public String create(Model model) {

        model.addAttribute("title", "Create");

        return "cheese/create";
    }
}
