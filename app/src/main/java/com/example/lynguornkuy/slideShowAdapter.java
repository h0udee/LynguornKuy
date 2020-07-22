package com.example.lynguornkuy;

import androidx.viewpager.widget.PagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.facebook.drawee.view.SimpleDraweeView;

public class slideShowAdapter extends PagerAdapter {


    private int[] imagePaths;

    public slideShowAdapter(int[] imagePaths) {
        this.imagePaths = imagePaths;
    }

    @Override
    public int getCount() {
        return imagePaths.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View itemView = inflater.inflate(R.layout.slide_show_item, container, false);

        ImageView imgSlide = itemView.findViewById(R.id.img_slide);
        int imagePath = imagePaths[position];
        imgSlide.setImageResource(imagePath);

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
