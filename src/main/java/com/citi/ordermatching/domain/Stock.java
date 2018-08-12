package com.citi.ordermatching.domain;

public class Stock {
    private Integer id;

    private String name;

    private String symbol;

    private Double currentprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public Double getCurrentprice() {
        return currentprice;
    }

    public void setCurrentprice(Double currentprice) {
        this.currentprice = currentprice;
    }
}