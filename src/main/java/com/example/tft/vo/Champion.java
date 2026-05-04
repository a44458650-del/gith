package com.example.tft.vo;

public class Champion {
    private Long id;
    private String name;
    private int cost;
    private String traits;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCost() { return cost; }
    public void setCost(int cost) { this.cost = cost; }
    public String getTraits() { return traits; }
    public void setTraits(String traits) { this.traits = traits; }
}
