package com.example.tft.service;

import com.example.tft.vo.Trait;
import java.util.List;

public interface TraitService {
    List<Trait> getAll();
    Trait getById(Long id);
    void create(Trait trait);
    void update(Trait trait);
    void delete(Long id);
}
