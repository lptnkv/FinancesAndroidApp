package com.example.finances;

public class Currency {
    private String name;
    private String price;
    private int flag;

    public Currency(String name, String price, int flag) {
        this.name = name;
        this.price = price;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
