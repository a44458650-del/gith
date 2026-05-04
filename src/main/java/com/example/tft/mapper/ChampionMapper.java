package com.example.tft.mapper;

import com.example.tft.vo.ChampionVo;
import java.util.List;

public interface ChampionMapper {
    List<ChampionVo> findAll();
    ChampionVo findById(Long id);
    void insert(ChampionVo champion);
    void update(ChampionVo champion);
    void delete(Long id);
}
