package com.example.jasonmitropoulos.londonveganguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopsFragment extends Fragment {


    public ShopsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.vegan_list, container, false);


        // Create a list of descriptions
        final ArrayList<Description> descriptions = new ArrayList<Description>();
        descriptions.add(new Description(R.drawable.ic_link, getString(R.string.bay_description), R.drawable.vegan, getString(R.string.bay_web)));
        descriptions.add(new Description(R.drawable.ic_link, getString(R.string.planet_description), R.drawable.vegan, getString(R.string.planet_web)));


        // Create a DescriptionAdapter, whose data source is a list of descriptions
        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions);

        // Find the ListView object
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // As is probably very obvious set an adapter on the listView
        listView.setAdapter(adapter);

        // Set a click listener to open a website when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Description description = descriptions.get(position);
                Uri descriptionUri = Uri.parse(description.getUrl());
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, descriptionUri);
                startActivity(browserIntent);
            }
        });


        return rootView;
    }

}
