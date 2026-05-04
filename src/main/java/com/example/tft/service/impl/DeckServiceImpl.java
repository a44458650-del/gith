package com.example.tft.service.impl;

import com.example.tft.mapper.DeckMapper;
import com.example.tft.service.DeckService;
import com.example.tft.vo.DeckVo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DeckServiceImpl implements DeckService {
    private final DeckMapper deckMapper;
    public DeckServiceImpl(DeckMapper deckMapper) { this.deckMapper = deckMapper; }
    public List<DeckVo> getAll() { return deckMapper.findAll(); }
    public List<DeckVo> getHiddenRecommend() { return deckMapper.findHiddenRecommend(); }
    public DeckVo getById(Long id) { return deckMapper.findById(id); }
    public void save(DeckVo deck) { if (deck.getId() == null) deckMapper.insert(deck); else deckMapper.update(deck); }
    public void delete(Long id) { deckMapper.delete(id); }
}
