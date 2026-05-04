package com.example.tft.mapper;

import com.example.tft.vo.Champion;
import java.util.List;

public interface ChampionMapper {
    List<Champion> findAll();
    Champion findById(Long id);
    void insert(Champion champion);
    void update(Champion champion);
    void delete(Long id);
}
