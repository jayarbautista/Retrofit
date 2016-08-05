package com.example.jayarbautista.retrofitsample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jay R Bautista on 8/2/2016.
 */
public class CreateFragment extends Fragment {

    public CreateFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create, container, false);
        ((TextView)view.findViewById(R.id.txtLabel)).setText("Create View");
        ((ImageView)view.findViewById(R.id.imageView)).setImageResource(R.drawable.icon_def_aw);
        return view;
    }
}
