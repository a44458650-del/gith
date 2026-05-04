package com.example.tft.mapper;

import com.example.tft.vo.Trait;
import java.util.List;

public interface TraitMapper {
    List<Trait> findAll();
    Trait findById(Long id);
    void insert(Trait trait);
    void update(Trait trait);
    void delete(Long id);
}
