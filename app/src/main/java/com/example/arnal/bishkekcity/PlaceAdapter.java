package com.example.arnal.bishkekcity;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PlaceAdapter extends ArrayAdapter<Place> {
    private Context context;
    private int itemResource;

    public PlaceAdapter(Activity context, int itemResource, ArrayList<Place> places) {
        super(context, 0, places);
        this.itemResource = itemResource;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 2. Have we inflated this view before?
        View listItemView;
        if (convertView != null) {

            // 2a. We have so let's reuse.
            listItemView = convertView;
        } else {

            // 2b. We have NOT so let's inflate
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            listItemView = inflater.inflate(this.itemResource, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        if (currentPlace != null) {

            // 4. Inflate the UI widgets
            ImageView placeLogo = (ImageView) listItemView.findViewById(R.id.place_logo);
            TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
            TextView placeAddress = (TextView) listItemView.findViewById(R.id.place_address);
            TextView placeDescription = (TextView) listItemView.findViewById(R.id.place_description);
            TextView placePhone = (TextView) listItemView.findViewById(R.id.place_phone);

            // 5. Set the UI widgets with appropriate data from the Place model
            placeName.setText(currentPlace.placeName);
            placeAddress.setText(currentPlace.address);
            placePhone.setText(currentPlace.phoneNumber);
            placeDescription.setText(currentPlace.placeDescription);
            placeLogo.setImageBitmap(currentPlace.logo);
        }
        return listItemView;
    }
}
