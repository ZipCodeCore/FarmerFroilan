package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster extends Airplane implements FarmVehicle {

    public CropDuster(String name){
        super(name);
    }

    public void operate(){
        fertilize();
    }
    //will be passed Crop parameter
    public void fertilize(){}

    public void makeNoise(){
        System.out.println("Stupid plane noise");
    }

    @Override
    public String toString(){
        return "Crop Duster";
    }
}
