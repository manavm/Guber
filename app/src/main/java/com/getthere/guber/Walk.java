package com.getthere.guber;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Aznerik on 12/8/2014.
 */
public class Walk extends Transport {

    Walk(LatLng start, LatLng dest){
        super(start, dest, "Walking");
        GoogleMapsFetchTimeTask timeTask = new GoogleMapsFetchTimeTask(this);
        timeTask.execute("walking");
    }

    public String getCost() { return "0"; }

}
