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
public class SleepFragment extends Fragment {


    public SleepFragment() {
        //  empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        //Item construction
        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Hotel Carlton", "4 rue Jussieu, 2e", R.drawable.carlton));
        items.add(new Item("Radisson Blu Hotel", "129 rue Servient, 3e", R.drawable.radisson));
        items.add(new Item("Mercure Lyon Centre Beaux-Arts ", "73-75 Rue du Président Edouard Herriot, 2e", R.drawable.mercure));
        items.add(new Item("Cour des Loges", "6 rue du Boeuf, 5e", R.drawable.loges));
        items.add(new Item("Novotel Lyon Confluence", "3 rue Montrochet, 2e", R.drawable.novotel));


        // create new object from class
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);



        return rootView;
    }


}
