package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.EdiblePackage.ChickenFood;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EarCorn;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.EdiblePackage.Egg;
import com.zipcodewilmington.froilansfarm.Produce;

public class Chicken extends Animal implements Produce {
    private Egg egg = new Egg();

    public String makeNoise() {
        System.out.println("Bok Bok!");
        return "Bok Bok!";
    }

    public Egg yieldProd() {
        return egg;
    }

//    @Override
    public String eat(ChickenFood chickyFood) {
        System.out.println("Peck Peck");
        return "Peck Peck";
    }



    public String eat(Edible obj) {
        System.out.println("Peck Peck");
        return "Peck Peck";
    }
}
