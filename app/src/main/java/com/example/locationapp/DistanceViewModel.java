package com.example.locationapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DistanceViewModel extends ViewModel {
    private MutableLiveData<Float> distance;

    public MutableLiveData<Float> getDistance() {
        // Create instance of LiveData object on first access
        if (distance == null) {
            distance = new MutableLiveData<>();

            // Initialize live data object
            distance.setValue(0f);
        }
        return distance;
    }
}
