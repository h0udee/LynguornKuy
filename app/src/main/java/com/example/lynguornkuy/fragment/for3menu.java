package com.example.lynguornkuy.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lynguornkuy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class for3menu extends Fragment {
    View v;

    TextView display;
    public for3menu() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_for3menu, container, false);
        getArguments().getString("String");
        display = v.findViewById(R.id.display);
        display.setText(getArguments().getString("String"));
        return v;
    }


}
