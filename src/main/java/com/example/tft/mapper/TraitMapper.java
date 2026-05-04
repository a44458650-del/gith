package com.example.tft.mapper;

import com.example.tft.vo.TraitVo;
import java.util.List;

public interface TraitMapper {
    List<TraitVo> findAll();
    TraitVo findById(Long id);
    void insert(TraitVo trait);
    void update(TraitVo trait);
    void delete(Long id);
}
