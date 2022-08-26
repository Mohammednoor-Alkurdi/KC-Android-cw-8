package com.example.e_shop;

import java.io.Serializable;

public class Item implements Serializable {

    private String itemName ;
      private int itemImage;
    private double itemPrice;
    private String itemds ;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemds() {
        return itemds;
    }

    public void setItemds(String itemds) {
        this.itemds = itemds;
    }

    public Item(String itemName, int itemImage, double itemPrice, String itemds) {
        this.itemName = itemName;
        this.itemImage = itemImage;
        this.itemPrice = itemPrice;
        this.itemds = itemds;
    }
}

