package com.example.tft.service.impl;

import com.example.tft.mapper.ChampionMapper;
import com.example.tft.mapper.DeckMapper;
import com.example.tft.service.DeckService;
import com.example.tft.vo.Champion;
import com.example.tft.vo.Deck;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class DeckServiceImpl implements DeckService {
    private final DeckMapper deckMapper;
    private final ChampionMapper championMapper;

    public DeckServiceImpl(DeckMapper deckMapper, ChampionMapper championMapper) {
        this.deckMapper = deckMapper;
        this.championMapper = championMapper;
    }
    public List<Deck> getAll() { return deckMapper.findAll(); }
    public List<Deck> getHiddenPotentialDecks() { return deckMapper.findHiddenPotential(); }
    public Deck getById(Long id) { return deckMapper.findById(id); }
    public void create(Deck deck) { deckMapper.insert(deck); }
    public void update(Deck deck) { deckMapper.update(deck); }
    public void delete(Long id) { deckMapper.delete(id); }

    public Map<String, Long> calculateSynergyCounts(List<Long> championIds) {
        Map<String, Long> counts = new HashMap<>();
        for (Long id : championIds) {
            Champion champion = championMapper.findById(id);
            if (champion == null || champion.getTraits() == null) continue;
            Arrays.stream(champion.getTraits().split(","))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .forEach(trait -> counts.put(trait, counts.getOrDefault(trait, 0L) + 1));
        }
        return counts;
    }
}
