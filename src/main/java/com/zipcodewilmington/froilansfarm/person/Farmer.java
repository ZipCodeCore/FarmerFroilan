package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Ridable;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

public class Farmer extends Botanist{

    public Farmer(String name){
        super(name);
    }

    public void mount(Ridable somethingRidable){
        System.out.print(this.getName()+" is riding "+somethingRidable.toString());
    }

    public void dismount(Ridable somethingRidable){
        System.out.print(this.getName()+" stopped riding "+somethingRidable.toString());
    }

    public void operate(Tractor tractor, CropRow cropRow){

    }

    public void feed(Animal animal){

    }
}
