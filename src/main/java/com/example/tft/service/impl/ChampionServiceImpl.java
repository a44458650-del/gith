package com.example.tft.service.impl;

import com.example.tft.mapper.ChampionMapper;
import com.example.tft.service.ChampionService;
import com.example.tft.vo.ChampionVo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ChampionServiceImpl implements ChampionService {
    private final ChampionMapper championMapper;
    public ChampionServiceImpl(ChampionMapper championMapper) { this.championMapper = championMapper; }
    public List<ChampionVo> getAll() { return championMapper.findAll(); }
    public ChampionVo getById(Long id) { return championMapper.findById(id); }
    public void save(ChampionVo champion) { if (champion.getId() == null) championMapper.insert(champion); else championMapper.update(champion); }
    public void delete(Long id) { championMapper.delete(id); }
}
