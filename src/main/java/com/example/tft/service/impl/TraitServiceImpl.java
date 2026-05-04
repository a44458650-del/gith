package com.example.tft.service.impl;

import com.example.tft.mapper.TraitMapper;
import com.example.tft.service.TraitService;
import com.example.tft.vo.Trait;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TraitServiceImpl implements TraitService {
    private final TraitMapper traitMapper;

    public TraitServiceImpl(TraitMapper traitMapper) { this.traitMapper = traitMapper; }
    public List<Trait> getAll() { return traitMapper.findAll(); }
    public Trait getById(Long id) { return traitMapper.findById(id); }
    public void create(Trait trait) { traitMapper.insert(trait); }
    public void update(Trait trait) { traitMapper.update(trait); }
    public void delete(Long id) { traitMapper.delete(id); }
}
