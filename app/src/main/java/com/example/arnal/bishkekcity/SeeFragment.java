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
public class SeeFragment extends Fragment {

        public SeeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list,container,false);

        final ArrayList<Place> places = new ArrayList<Place>();

        Bitmap alatoo = BitmapFactory.decodeResource(getResources(), R.drawable.alatoo);
        Bitmap mus = BitmapFactory.decodeResource(getResources(), R.drawable.mus);
        Bitmap osh = BitmapFactory.decodeResource(getResources(), R.drawable.osh);
        Bitmap auca = BitmapFactory.decodeResource(getResources(), R.drawable.auca);

        Place see_alatoo = new Place(getString(R.string.alatoo_name), getString(R.string.alatoo_description), getString(R.string.alatoo_phone), getString(R.string.alatoo_address));
        see_alatoo.logo = alatoo;
        places.add(see_alatoo);

        Place see_mus = new Place(getString(R.string.mus_name), getString(R.string.mus_description), getString(R.string.mus_phone), getString(R.string.mus_address));
        see_mus.logo = mus;
        places.add(see_mus);

        Place see_osh = new Place(getString(R.string.osh_name), getString(R.string.osh_description), getString(R.string.osh_phone), getString(R.string.osh_address));
        see_osh.logo = osh;
        places.add(see_osh);

        Place see_auca = new Place(getString(R.string.un_name), getString(R.string.un_description), getString(R.string.un_phone), getString(R.string.un_address));
        see_auca.logo = auca;
        places.add(see_auca);


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
