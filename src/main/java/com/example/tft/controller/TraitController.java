package com.example.tft.controller;

import com.example.tft.service.TraitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TraitController {
    private final TraitService traitService;
    public TraitController(TraitService traitService) { this.traitService = traitService; }

    @GetMapping("/traits")
    public String list(Model model) { model.addAttribute("traits", traitService.getAll()); return "traits/list"; }
}
