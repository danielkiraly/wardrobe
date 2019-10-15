package com.codecool.wardrobe.hanger;

import com.codecool.wardrobe.clothing.Clothing;

import java.util.UUID;

public class Hanger {

    protected Clothing upperClothing = null;

    public void addUpper(Clothing clothing){
        if (isUpperEmpty()){
            upperClothing = clothing;
        }else{
            System.out.println("Full");
        }
    }

    public Clothing getUpperClothing() {
        return upperClothing;
    }

    public Clothing remove(UUID id) {
        if(upperClothing.getId().equals(id)){
            Clothing result = upperClothing;
            upperClothing = null;
            return result;
        }
        return null;
    }

    public boolean isUpperEmpty() {
        if(upperClothing == null){
            return true;
        }
        return false;
    }
}
