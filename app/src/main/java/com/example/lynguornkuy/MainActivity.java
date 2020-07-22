package com.example.lynguornkuy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.example.lynguornkuy.fragment.for3menu;
import com.example.lynguornkuy.fragment.homeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fl, new homeFragment()).commit();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.Home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fl, new homeFragment()).commit();
                    return true;
                case R.id.Categories:
                    bundle.putString("String", "This is Categories Fragment");
                    showFragments(new for3menu(), bundle);
                    return true;
                case R.id.Search:
                    bundle.putString("String", "This is Search Fragment");
                    showFragments(new for3menu(), bundle);
                    return true;
                case R.id.Account:
                    bundle.putString("String", "This is Account Fragment");
                    showFragments(new for3menu(), bundle);
                    return true;
            }
            return false;
        }
    };

    private void showFragments(Fragment fragement, Bundle b){
        getSupportFragmentManager().beginTransaction().replace(R.id.fl, fragement).commit();
        fragement.setArguments(b);
    }
}
