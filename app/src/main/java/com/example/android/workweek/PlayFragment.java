package com.example.android.workweek;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlayFragment extends Fragment {


    public PlayFragment() {
        //  empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        //Item construction
        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Parc de la Tête d’Or", "6e", R.drawable.teteor));
        items.add(new Item("Lyon City Boat", "Rhone", R.drawable.boat));
        items.add(new Item("Le Mur de Lyon", "Gerland", R.drawable.mur));
        items.add(new Item("Golf Blue Green Grand Lyon Chassieu", "Chassieu", R.drawable.golf));


        // create new object from class
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);



        return rootView;
    }


}
