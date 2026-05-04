package com.example.tft.service;

import com.example.tft.vo.Champion;
import java.util.List;

public interface ChampionService {
    List<Champion> getAll();
    Champion getById(Long id);
    void create(Champion champion);
    void update(Champion champion);
    void delete(Long id);
}
