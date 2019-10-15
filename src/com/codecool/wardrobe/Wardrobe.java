package com.codecool.wardrobe;

import com.codecool.wardrobe.clothing.Clothes;
import com.codecool.wardrobe.clothing.Clothing;
import com.codecool.wardrobe.hanger.Hanger;
import com.codecool.wardrobe.hanger.SuperHanger;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Wardrobe {

    private List<Hanger> hangers = new ArrayList<>();
    private List<SuperHanger> superHangers = new ArrayList<>();

    private int capacity;

    public Wardrobe(int capacity){
        this.capacity = capacity;
    }

    public void addHanger(Hanger hanger){
        if((hangers.size() + superHangers.size()) < capacity){
            hangers.add(hanger);
        }
    }

    public void addSuperHanger(SuperHanger superHanger){
        if((hangers.size() + superHangers.size()) < capacity){
            superHangers.add(superHanger);
        }
    }

    public Clothing remove(UUID id){
        for (Hanger hanger : hangers) {
            Clothing clothing = hanger.remove(id);
            if(clothing != null){
                return clothing;
            }
        }
        for (SuperHanger hanger : superHangers) {
            Clothing clothing = hanger.remove(id);
            if(clothing != null){
                return clothing;
            }
        }
        return null;
    }

    public boolean isPlace(Clothing clothing){
        if(clothing.getType().equals(Clothes.ClothingType.LOWER)){
            for (SuperHanger superHanger : superHangers) {
                if(superHanger.isLowerEmpty()){
                    return true;
                }
            }
        }
        if(clothing.getType().equals(Clothes.ClothingType.UPPER)) {
            for (Hanger hanger : hangers) {
                if (hanger.isUpperEmpty()){
                    return true;
                }
            }
            for (SuperHanger superHangers : superHangers) {
                if (superHangers.isUpperEmpty()){
                    return true;
                }
            }
        }
        return false;
    }

    public void printClothes(){
        for (SuperHanger hanger : superHangers) {
            System.out.println(hanger.getLowerClothing().getType());
        }
    }
}
