package com.example.tft.vo;

public class DeckVo {
    private Long id;
    private String name;
    private String tier;
    private String description;
    private String championIds;
    private boolean hiddenRecommend;
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTier() { return tier; }
    public void setTier(String tier) { this.tier = tier; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getChampionIds() { return championIds; }
    public void setChampionIds(String championIds) { this.championIds = championIds; }
    public boolean isHiddenRecommend() { return hiddenRecommend; }
    public void setHiddenRecommend(boolean hiddenRecommend) { this.hiddenRecommend = hiddenRecommend; }
}
