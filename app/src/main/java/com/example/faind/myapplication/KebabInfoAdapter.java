package com.example.faind.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class KebabInfoAdapter implements GoogleMap.InfoWindowAdapter {

    private final Context context;

    public KebabInfoAdapter(Context context) {
        this.context = context;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        Log.d("KebabInfoAdapter" , "getInfoWindow");
        return new KebabInfoView(context);
    }

    @Override
    public View getInfoContents(Marker marker) {
        Log.d("KebabInfoAdapter", "getInfoWindow");
        return new KebabInfoView(context);
    }
}
