package com.example.tft.controller;

import com.example.tft.service.DeckService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private final DeckService deckService;
    public MainController(DeckService deckService) { this.deckService = deckService; }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("hiddenDecks", deckService.getHiddenRecommend());
        return "index";
    }
}
