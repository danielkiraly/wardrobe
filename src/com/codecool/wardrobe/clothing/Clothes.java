package com.codecool.wardrobe.clothing;

public enum Clothes {
    SHIRT(ClothingType.UPPER),
    BARNAALSOJA(ClothingType.LOWER);

    ClothingType clothingType;

    Clothes(ClothingType clothingType){
        this.clothingType = clothingType;
    }

    public enum ClothingType{
        UPPER,
        LOWER
    }

}
