package com.zipcodewilmington.froilansfarm.Vehicles;

<<<<<<< HEAD

import com.zipcodewilmington.froilansfarm.Crops.Crops;

public class CropDuster implements FarmVehicle, Vehicle, NoiseMaker, Flyable {
    public boolean isFarmVehicle() {
        return true;
    }

    public boolean canFly() {
        return true;
    }

    public boolean makesNoise() {
        return true;
    }

    public boolean operate() {
        return true;
    }
    public Crops fertilize(CropRow cropRow){
        return null;//croprow method is fetilized true
    }

=======
import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;

public class CropDuster implements FarmVehicle, NoiseMaker {
>>>>>>> master
}

