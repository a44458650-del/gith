package com.example.tft.service;

import com.example.tft.vo.DeckVo;
import java.util.List;

public interface DeckService {
    List<DeckVo> getAll();
    List<DeckVo> getHiddenRecommend();
    DeckVo getById(Long id);
    void save(DeckVo deck);
    void delete(Long id);
}
