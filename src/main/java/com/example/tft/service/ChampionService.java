package com.example.tft.service;

import com.example.tft.vo.ChampionVo;
import java.util.List;

public interface ChampionService {
    List<ChampionVo> getAll();
    ChampionVo getById(Long id);
    void save(ChampionVo champion);
    void delete(Long id);
}
