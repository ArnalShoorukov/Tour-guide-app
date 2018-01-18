package com.example.arnal.bishkekcity;


import android.content.Context;
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
public class DoFragment extends Fragment {
    private Context context;

    public DoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();

        Bitmap first_do = BitmapFactory.decodeResource(getResources(), R.drawable.first_do);
        Bitmap second_do = BitmapFactory.decodeResource(getResources(), R.drawable.second_do);
        Bitmap third_do = BitmapFactory.decodeResource(getResources(), R.drawable.third_do);

        Place tour = new Place(getString(R.string.do_name), getString(R.string.ultimate_description), getString(R.string.ultimate_phone), getString(R.string.ultimate_address));
        tour.logo = first_do;
        places.add(tour);

        Place trekking = new Place(getString(R.string.trekking_name), getString(R.string.trekking_description), getString(R.string.trekking_phone), getString(R.string.trekking_address));
        trekking.logo = second_do;
        places.add(trekking);

        Place horse = new Place(getString(R.string.horse_name), getString(R.string.horse_description), getString(R.string.horse_phone), getString(R.string.horse_address));
        horse.logo = third_do;
        places.add(horse);

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
