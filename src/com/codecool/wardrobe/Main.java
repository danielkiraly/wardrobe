package com.codecool.wardrobe;

import com.codecool.wardrobe.clothing.Clothes;
import com.codecool.wardrobe.clothing.Clothing;
import com.codecool.wardrobe.hanger.Hanger;
import com.codecool.wardrobe.hanger.SuperHanger;

public class Main {

    public static void main(String[] args) {

        Wardrobe wardrobe = new Wardrobe(10);

        Clothing shirt = new Clothing(Clothes.ClothingType.UPPER, "Zara");
        Clothing jeans = new Clothing(Clothes.ClothingType.LOWER, "Armani");

        Hanger simpleHanger = new Hanger();
        SuperHanger complexHanger = new SuperHanger();

        simpleHanger.addUpper(shirt);
        complexHanger.addLower(jeans);
        complexHanger.addUpper(shirt);
        complexHanger.addUpper(shirt);

        wardrobe.addHanger(simpleHanger);
        wardrobe.addSuperHanger(complexHanger);

        wardrobe.printClothes();
    }
}
