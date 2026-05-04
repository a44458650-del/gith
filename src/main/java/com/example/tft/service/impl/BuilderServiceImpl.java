package com.example.tft.service.impl;

import com.example.tft.service.BuilderService;
import com.example.tft.service.ChampionService;
import com.example.tft.vo.ChampionVo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class BuilderServiceImpl implements BuilderService {
    private final ChampionService championService;
    public BuilderServiceImpl(ChampionService championService) { this.championService = championService; }
    public Map<String, Integer> calculateSynergy(List<Long> championIds) {
        Map<String, Integer> result = new HashMap<>();
        for (Long id : championIds) {
            ChampionVo champion = championService.getById(id);
            if (champion == null || champion.getTraits() == null) continue;
            for (String trait : champion.getTraits().split(",")) {
                String key = trait.trim();
                if (!key.isEmpty()) result.put(key, result.getOrDefault(key, 0) + 1);
            }
        }
        return result;
    }
}
