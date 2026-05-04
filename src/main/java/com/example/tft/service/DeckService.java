package com.example.tft.service;

import com.example.tft.vo.Deck;
import java.util.List;
import java.util.Map;

public interface DeckService {
    List<Deck> getAll();
    List<Deck> getHiddenPotentialDecks();
    Deck getById(Long id);
    void create(Deck deck);
    void update(Deck deck);
    void delete(Long id);
    Map<String, Long> calculateSynergyCounts(java.util.List<Long> championIds);
}
