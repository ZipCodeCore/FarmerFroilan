package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.plants.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow<T extends Crop> {

    private List<T> crops;


    public CropRow() {
        crops = new ArrayList<T>();
    }

    public void addCrop (T newCrop) {
        crops.add(newCrop);
    }

    public Crop getCrop(int index) {
        return crops.get(index);
    }

}
