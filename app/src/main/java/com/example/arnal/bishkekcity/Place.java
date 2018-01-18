package com.example.arnal.bishkekcity;

import android.graphics.Bitmap;

public class Place {

    public String placeName;
    public String placeDescription;
    public String phoneNumber;
    public String address;
    public Bitmap logo;


    public Place(String placeName,
                 String placeDescription,
                 String phoneNumber,
                 String address)
    {
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}