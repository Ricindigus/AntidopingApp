package com.example.apoyo03_ui.antidoppingapp;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class AUTActivity extends AppCompatActivity {
    private float x1,x2;
    static final int MIN_DISTANCE = 150;
    int fragmentActual = 0;
    int fragmentAnterior = 0;
    Fragment fragment;
    private FloatingActionButton fabAtras;
    private FloatingActionButton fabAdelante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aut);
        showToolbar("AUT",true);
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.aut_primary_dark));
        }
        fabAtras = (FloatingActionButton) findViewById(R.id.fab_atras);
        fabAdelante = (FloatingActionButton) findViewById(R.id.fab_adelante);


    }

    public void showToolbar(String title, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarApp);
        toolbar.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.aut_primary));
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
