package com.example.tft.controller;

import com.example.tft.service.ChampionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChampionController {
    private final ChampionService championService;
    public ChampionController(ChampionService championService) { this.championService = championService; }

    @GetMapping("/champions")
    public String list(Model model) { model.addAttribute("champions", championService.getAll()); return "champions/list"; }
}
