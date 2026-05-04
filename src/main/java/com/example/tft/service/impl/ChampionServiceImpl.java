package com.example.tft.service.impl;

import com.example.tft.mapper.ChampionMapper;
import com.example.tft.service.ChampionService;
import com.example.tft.vo.Champion;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ChampionServiceImpl implements ChampionService {
    private final ChampionMapper championMapper;

    public ChampionServiceImpl(ChampionMapper championMapper) { this.championMapper = championMapper; }
    public List<Champion> getAll() { return championMapper.findAll(); }
    public Champion getById(Long id) { return championMapper.findById(id); }
    public void create(Champion champion) { championMapper.insert(champion); }
    public void update(Champion champion) { championMapper.update(champion); }
    public void delete(Long id) { championMapper.delete(id); }
}
