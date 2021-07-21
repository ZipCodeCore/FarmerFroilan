package com.zipcodewilmington.froilansfarm;

public interface Produce {

    void yield(Edible edible);

    boolean hasBeenFertilized();

    boolean hasBeenHarvested();
}
