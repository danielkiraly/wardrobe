package com.codecool.wardrobe.clothing;

import java.util.UUID;

public class Clothing {

    private UUID id;

    private Clothes.ClothingType clothingType;

    private String brand;

    public Clothing(Clothes.ClothingType clothingType, String brand){
        id = UUID.randomUUID();
        this.clothingType = clothingType;
        this.brand = brand;
    }

    public UUID getId() {
        return id;
    }

    public Clothes.ClothingType getType() {
        return clothingType;
    }
}
