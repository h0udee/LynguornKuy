package com.example.lynguornkuy.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lynguornkuy.R;
import com.example.lynguornkuy.slideShowAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class homeFragment extends Fragment {
    View v;

    public homeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_home, container, false);
        ViewPager viewPager = v.findViewById(R.id.view_pager);

        int[] imagePaths = new int[]{R.drawable.acer_monitor, R.drawable.downfall, R.drawable.too_much_never_enough};
        slideShowAdapter adapter = new slideShowAdapter(imagePaths);

        viewPager.setAdapter(adapter);

        return v;
    }
}
