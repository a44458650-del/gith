package com.example.tft.controller;

import com.example.tft.service.ChampionService;
import com.example.tft.service.DeckService;
import com.example.tft.service.TraitService;
import com.example.tft.vo.ChampionVo;
import com.example.tft.vo.DeckVo;
import com.example.tft.vo.TraitVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final ChampionService championService;
    private final TraitService traitService;
    private final DeckService deckService;

    public AdminController(ChampionService championService, TraitService traitService, DeckService deckService) {
        this.championService = championService;
        this.traitService = traitService;
        this.deckService = deckService;
    }

    @GetMapping("/champions") public String champions(Model model){ model.addAttribute("items", championService.getAll()); return "admin/champions"; }
    @PostMapping("/champions") public String saveChampion(ChampionVo vo){ championService.save(vo); return "redirect:/admin/champions"; }
    @PostMapping("/champions/delete/{id}") public String delChampion(@PathVariable Long id){ championService.delete(id); return "redirect:/admin/champions"; }

    @GetMapping("/traits") public String traits(Model model){ model.addAttribute("items", traitService.getAll()); return "admin/traits"; }
    @PostMapping("/traits") public String saveTrait(TraitVo vo){ traitService.save(vo); return "redirect:/admin/traits"; }
    @PostMapping("/traits/delete/{id}") public String delTrait(@PathVariable Long id){ traitService.delete(id); return "redirect:/admin/traits"; }

    @GetMapping("/decks") public String decks(Model model){ model.addAttribute("items", deckService.getAll()); return "admin/decks"; }
    @PostMapping("/decks") public String saveDeck(DeckVo vo){ deckService.save(vo); return "redirect:/admin/decks"; }
    @PostMapping("/decks/delete/{id}") public String delDeck(@PathVariable Long id){ deckService.delete(id); return "redirect:/admin/decks"; }
}
