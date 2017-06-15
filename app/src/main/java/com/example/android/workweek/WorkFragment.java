package com.example.android.workweek;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkFragment extends Fragment {


    public WorkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);


        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Workloft", "әpә", R.drawable.workloft));
        items.add(new Item("La coloc", "әṭa", R.drawable.coloc));
        items.add(new Item("La cordee", "angsi", R.drawable.cordee));
        items.add(new Item("Sofffa", "tune", R.drawable.sofffa));


        // create new object from class
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, "green");


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);



        return rootView;
    }

}
