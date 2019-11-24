package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicles;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.mainFarm.Farm;

public class Tractor extends Vehicle implements FarmVehicles {
    private Rider currentRider;
    private Farm currentFarm;
    private Boolean wasRidden;

    public void operate(Farm farm) {
        currentFarm = farm;
    }

    public String makeNoise() {
        return "tractor noises that kinda sound like aggressive heavy honks";
    }

    public Boolean riderRiding(Rider rider) {
        if(currentRider == null) {
            currentRider = rider;
            return true;
        }else {
            return false;
        }
    }

    public Boolean mounted() {
        wasRidden = true;
        return wasRidden;
    }

    public Boolean dismounted() {
        wasRidden = false;
        return wasRidden;
    }
}
