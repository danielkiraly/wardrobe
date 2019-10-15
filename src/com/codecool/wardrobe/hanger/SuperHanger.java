package com.codecool.wardrobe.hanger;

import com.codecool.wardrobe.clothing.Clothing;

import java.util.UUID;

public class SuperHanger extends Hanger{

    Clothing lowerClothing = null;

    public void addLower(Clothing clothing){
        if(isLowerEmpty()){
            lowerClothing = clothing;
        }
    }

    public boolean isLowerEmpty() {
        if(lowerClothing == null){
            return true;
        }
        return false;
    }

    public Clothing getLowerClothing() {
        return lowerClothing;
    }

    @Override
    public Clothing remove(UUID id) {
        if(super.upperClothing.getId().equals(id)){
            Clothing result = upperClothing;
            upperClothing = null;
            return result;
        }
        if(lowerClothing.getId().equals(id)){
            Clothing result = lowerClothing;
            lowerClothing = null;
            return result;
        }
        return null;
    }

}
