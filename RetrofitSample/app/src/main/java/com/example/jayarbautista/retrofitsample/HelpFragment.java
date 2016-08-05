package com.example.jayarbautista.retrofitsample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jay R Bautista on 8/3/2016.
 */
public class HelpFragment extends Fragment {

    public HelpFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create, container, false);
        ((TextView)view.findViewById(R.id.txtLabel)).setText("Help View");
        ((ImageView)view.findViewById(R.id.imageView)).setImageResource(R.drawable.icon_defense_warrior);
        return view;
    }
}
