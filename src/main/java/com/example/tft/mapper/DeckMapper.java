package com.example.tft.mapper;

import com.example.tft.vo.DeckVo;
import java.util.List;

public interface DeckMapper {
    List<DeckVo> findAll();
    List<DeckVo> findHiddenRecommend();
    DeckVo findById(Long id);
    void insert(DeckVo deck);
    void update(DeckVo deck);
    void delete(Long id);
}
