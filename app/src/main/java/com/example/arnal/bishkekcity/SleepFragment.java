package com.example.arnal.bishkekcity;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SleepFragment extends Fragment {

    public SleepFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container,false);

        final ArrayList<Place> places = new ArrayList<Place>();

        Bitmap akkeme = BitmapFactory.decodeResource(getResources(), R.drawable.akkeme );
        Bitmap jannat = BitmapFactory.decodeResource(getResources(), R.drawable.jannat);
        Bitmap hayat = BitmapFactory.decodeResource(getResources(), R.drawable.hayat);
        Bitmap mba = BitmapFactory.decodeResource(getResources(), R.drawable.mba);

        Place sleep_keme = new Place(getString(R.string.alatoo_name), getString(R.string.alatoo_description), getString(R.string.alatoo_phone), getString(R.string.alatoo_address));
        sleep_keme.logo = akkeme;
        places.add(sleep_keme);

        Place sleep_jannat = new Place(getString(R.string.mus_name), getString(R.string.mus_description), getString(R.string.mus_phone), getString(R.string.mus_address));
        sleep_jannat.logo = jannat;
        places.add(sleep_jannat);

        Place sleep_hayat = new Place(getString(R.string.osh_name), getString(R.string.osh_description), getString(R.string.osh_phone), getString(R.string.osh_address));
        sleep_hayat.logo = hayat;
        places.add(sleep_hayat);

        Place sleep_mba = new Place(getString(R.string.mba_name), getString(R.string.mba_description), getString(R.string.mba_phone), getString(R.string.mba_address));
        sleep_mba.logo = mba;
        places.add(sleep_mba);

        // Initialize the place adapter
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), R.layout.list_place, places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.listings_view);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the listings_view.
        listView.setAdapter(adapter);

        return rootView;
    }
}
