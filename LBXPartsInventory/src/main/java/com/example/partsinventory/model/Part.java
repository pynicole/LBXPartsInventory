package com.example.partsinventory.model;

public class Part {
    private String partNumber;
    private int quantity;

    public Part() {}

    public Part(String partNumber, int quantity) {
        this.partNumber = partNumber;
        this.quantity = quantity;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
