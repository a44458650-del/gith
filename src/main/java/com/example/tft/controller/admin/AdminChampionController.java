package com.example.tft.controller.admin;

import com.example.tft.service.ChampionService;
import com.example.tft.vo.Champion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/champions")
public class AdminChampionController {
    private final ChampionService championService;
    public AdminChampionController(ChampionService championService) { this.championService = championService; }
    @GetMapping public String list(Model model){ model.addAttribute("items", championService.getAll()); return "admin/champions"; }
    @PostMapping public String create(Champion c){ championService.create(c); return "redirect:/admin/champions"; }
    @PostMapping("/{id}/update") public String update(@PathVariable Long id, Champion c){ c.setId(id); championService.update(c); return "redirect:/admin/champions"; }
    @PostMapping("/{id}/delete") public String delete(@PathVariable Long id){ championService.delete(id); return "redirect:/admin/champions"; }
}
