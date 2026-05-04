package com.example.tft.service.impl;

import com.example.tft.mapper.TraitMapper;
import com.example.tft.service.TraitService;
import com.example.tft.vo.TraitVo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TraitServiceImpl implements TraitService {
    private final TraitMapper traitMapper;
    public TraitServiceImpl(TraitMapper traitMapper) { this.traitMapper = traitMapper; }
    public List<TraitVo> getAll() { return traitMapper.findAll(); }
    public TraitVo getById(Long id) { return traitMapper.findById(id); }
    public void save(TraitVo trait) { if (trait.getId() == null) traitMapper.insert(trait); else traitMapper.update(trait); }
    public void delete(Long id) { traitMapper.delete(id); }
}
