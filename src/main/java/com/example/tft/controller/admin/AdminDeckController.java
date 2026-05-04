package com.example.tft.controller.admin;

import com.example.tft.service.DeckService;
import com.example.tft.vo.Deck;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/decks")
public class AdminDeckController {
    private final DeckService deckService;
    public AdminDeckController(DeckService deckService) { this.deckService = deckService; }
    @GetMapping public String list(Model model){ model.addAttribute("items", deckService.getAll()); return "admin/decks"; }
    @PostMapping public String create(Deck d){ deckService.create(d); return "redirect:/admin/decks"; }
    @PostMapping("/{id}/update") public String update(@PathVariable Long id, Deck d){ d.setId(id); deckService.update(d); return "redirect:/admin/decks"; }
    @PostMapping("/{id}/delete") public String delete(@PathVariable Long id){ deckService.delete(id); return "redirect:/admin/decks"; }
}
