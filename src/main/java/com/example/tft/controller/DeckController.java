package com.example.tft.controller;

import com.example.tft.service.DeckService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DeckController {
    private final DeckService deckService;
    public DeckController(DeckService deckService) { this.deckService = deckService; }

    @GetMapping("/decks")
    public String list(Model model) { model.addAttribute("decks", deckService.getAll()); return "decks/list"; }

    @GetMapping("/decks/{deckId}")
    public String detail(@PathVariable Long deckId, Model model) { model.addAttribute("deck", deckService.getById(deckId)); return "decks/detail"; }
}
