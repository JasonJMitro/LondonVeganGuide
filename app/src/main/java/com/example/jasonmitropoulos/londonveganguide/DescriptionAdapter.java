package com.example.jasonmitropoulos.londonveganguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class DescriptionAdapter extends ArrayAdapter<Description> {


    public DescriptionAdapter(Context context, ArrayList<Description> descriptions) {
        super(context, 0, descriptions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Description object located at this position in the list
        Description currentDescription = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID description
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        // Get the Description from the currentDescription object and set this text on
        // the descriptionTextView
        descriptionTextView.setText(currentDescription.getDescription());


        // Find the ImageView in the list_item.xml layout with the ID ic_link
        ImageView imageView1 = (ImageView) listItemView.findViewById(R.id.ic_link);
        imageView1.setImageResource(currentDescription.getImage1());
        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView2 = (ImageView) listItemView.findViewById(R.id.image);
        imageView2.setImageResource(currentDescription.getImage2());

        // Return the whole list item layout (containing 2 ImageViews and 1 TextView) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
