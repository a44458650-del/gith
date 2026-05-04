package com.example.tft.mapper;

import com.example.tft.vo.Deck;
import java.util.List;

public interface DeckMapper {
    List<Deck> findAll();
    List<Deck> findHiddenPotential();
    Deck findById(Long id);
    void insert(Deck deck);
    void update(Deck deck);
    void delete(Long id);
}
