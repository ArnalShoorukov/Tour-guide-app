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
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();

        Bitmap faiza = BitmapFactory.decodeResource(getResources(), R.drawable.faiza);
        Bitmap fakir = BitmapFactory.decodeResource(getResources(), R.drawable.fakir);
        Bitmap pizza = BitmapFactory.decodeResource(getResources(), R.drawable.pizza);

        Place eat_faiza = new Place(getString(R.string.faiza_name), getString(R.string.faiza_description), getString(R.string.faiza_phone), getString(R.string.faiza_address));
        eat_faiza.logo = faiza;
        places.add(eat_faiza);

        Place eat_fakir = new Place(getString(R.string.fakir_name), getString(R.string.fakir_description), getString(R.string.fakir_phone), getString(R.string.fakir_address));
        eat_fakir.logo = fakir;
        places.add(eat_fakir);

        Place eat_pizza = new Place(getString(R.string.pizza_name), getString(R.string.pizza_description), getString(R.string.pizza_phone), getString(R.string.pizza_address));
        eat_pizza.logo = pizza;
        places.add(eat_pizza);

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