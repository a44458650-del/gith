package com.example.tft.service;

import com.example.tft.vo.TraitVo;
import java.util.List;

public interface TraitService {
    List<TraitVo> getAll();
    TraitVo getById(Long id);
    void save(TraitVo trait);
    void delete(Long id);
}
