package com.example.tft.controller;

import com.example.tft.service.BuilderService;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BuilderController {
    private final BuilderService builderService;
    public BuilderController(BuilderService builderService) { this.builderService = builderService; }

    @GetMapping("/builder")
    public String builder() { return "builder/index"; }

    @PostMapping("/api/builder/synergy")
    @ResponseBody
    public Map<String, Integer> synergy(@RequestBody List<Long> championIds) { return builderService.calculateSynergy(championIds); }
}
