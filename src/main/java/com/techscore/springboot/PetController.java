package com.techscore.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PetController {
    @Autowired
    PetRepository petRepository;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        List<Pet> petlist=petRepository.findAll();
        model.addAttribute("petlist", petlist);
        return "index";
    }
}