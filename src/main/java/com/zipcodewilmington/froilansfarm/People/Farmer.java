package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Person;

public class Farmer extends PersonDecorator{
    public Farmer(Person decoratedPerson) {
        super(decoratedPerson);
    }

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return null;
    }
}
