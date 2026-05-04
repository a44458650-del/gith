package com.example.tft.controller.admin;

import com.example.tft.service.TraitService;
import com.example.tft.vo.Trait;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/traits")
public class AdminTraitController {
    private final TraitService traitService;
    public AdminTraitController(TraitService traitService) { this.traitService = traitService; }
    @GetMapping public String list(Model model){ model.addAttribute("items", traitService.getAll()); return "admin/traits"; }
    @PostMapping public String create(Trait t){ traitService.create(t); return "redirect:/admin/traits"; }
    @PostMapping("/{id}/update") public String update(@PathVariable Long id, Trait t){ t.setId(id); traitService.update(t); return "redirect:/admin/traits"; }
    @PostMapping("/{id}/delete") public String delete(@PathVariable Long id){ traitService.delete(id); return "redirect:/admin/traits"; }
}
