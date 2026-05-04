package com.example.tft.controller;

import com.example.tft.service.ChampionService;
import com.example.tft.service.DeckService;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class DeckController {
    private final DeckService deckService;
    private final ChampionService championService;

    public DeckController(DeckService deckService, ChampionService championService) {
        this.deckService = deckService;
        this.championService = championService;
    }

    @GetMapping("/decks")
    public String decks(Model model) {
        model.addAttribute("decks", deckService.getAll());
        model.addAttribute("hiddenDecks", deckService.getHiddenPotentialDecks());
        return "decks/list";
    }

    @GetMapping("/decks/{deckId}")
    public String deckDetail(@PathVariable Long deckId, Model model) {
        model.addAttribute("deck", deckService.getById(deckId));
        return "decks/detail";
    }

    @GetMapping("/builder")
    public String builder(Model model) {
        model.addAttribute("champions", championService.getAll());
        return "builder";
    }

    @PostMapping("/api/synergies/calculate")
    @ResponseBody
    public Map<String, Long> calculate(@RequestBody(required = false) List<Long> championIds) {
        return deckService.calculateSynergyCounts(championIds == null ? Collections.emptyList() : championIds);
    }
}
