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
public class EatFragment extends Fragment {


    public EatFragment() {
        // empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        //Item construction
        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Kitchen Café", "34 rue Chevreul, 7e", R.drawable.kitchen));
        items.add(new Item("Le Diploïd", "18 rue de la Platière, 1er", R.drawable.diplo));
        items.add(new Item("Le Shack", "4 rue Terme, 1er", R.drawable.shack));
        items.add(new Item("Le Café des Mauvais Garçons", "2 places du Petit Collège, 5e", R.drawable.cafe));


        // create new object from class
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);



        return rootView;
    }


}
