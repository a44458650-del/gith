package com.example.tft.vo;

public class Deck {
    private Long id;
    private String name;
    private String tier;
    private double pickRate;
    private double winRate;
    private boolean hiddenPotential;
    private String summary;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTier() { return tier; }
    public void setTier(String tier) { this.tier = tier; }
    public double getPickRate() { return pickRate; }
    public void setPickRate(double pickRate) { this.pickRate = pickRate; }
    public double getWinRate() { return winRate; }
    public void setWinRate(double winRate) { this.winRate = winRate; }
    public boolean isHiddenPotential() { return hiddenPotential; }
    public void setHiddenPotential(boolean hiddenPotential) { this.hiddenPotential = hiddenPotential; }
    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }
}
