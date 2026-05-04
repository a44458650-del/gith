package com.example.tft.service;

import java.util.List;
import java.util.Map;

public interface BuilderService {
    Map<String, Integer> calculateSynergy(List<Long> championIds);
}
