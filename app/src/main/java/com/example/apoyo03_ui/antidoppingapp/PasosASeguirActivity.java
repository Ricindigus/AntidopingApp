package com.example.apoyo03_ui.antidoppingapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.view.Window;
import android.view.WindowManager;

public class PasosASeguirActivity extends AppCompatActivity {


    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private int fragmentActual = 1;
    private float x1,x2;
    private FloatingActionButton fabAtras;
    private FloatingActionButton fabAdelante;
    static final int MIN_DISTANCE = 150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasos_a_seguir);

        showToolbar("AUT",true);
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.aut_primary_dark));
        }

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.aut_container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        fabAtras = (FloatingActionButton) findViewById(R.id.fab_atras);
        fabAdelante = (FloatingActionButton) findViewById(R.id.fab_adelante);

        fabAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentActual = mViewPager.getCurrentItem();
                if(fragmentActual > 0) {
                    mViewPager.setCurrentItem(fragmentActual - 1);
                    fragmentActual = mViewPager.getCurrentItem() + 1;
                }
            }
        });
        fabAdelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentActual = mViewPager.getCurrentItem();
                if(fragmentActual < 3) {
                    mViewPager.setCurrentItem(fragmentActual + 1);
                    fragmentActual = mViewPager.getCurrentItem() + 1;
                }
            }
        });
    }

    public static class PlaceholderFragment extends Fragment {
        private static final String ARG_SECTION_NUMBER = "section_number";
        public PlaceholderFragment() {
        }
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = null;
            int pagina = getArguments().getInt(ARG_SECTION_NUMBER);

            switch (pagina) {
                case 1:
                    rootView = inflater.inflate(R.layout.fragment_paso1, container, false);
                    break;
                case 2:
                    rootView = inflater.inflate(R.layout.fragment_paso2, container, false);
                    break;
                case 3:
                    rootView = inflater.inflate(R.layout.fragment_paso3, container, false);
                    break;
                case 4:
                    rootView = inflater.inflate(R.layout.fragment_paso4, container, false);
                    break;
                default: break;
            }
            return rootView;
        }
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            return PlaceholderFragment.newInstance(position + 1);
        }
        @Override
        public int getCount() {
            return 4;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
                case 3:
                    return "SECTION 4";
            }
            return null;
        }
    }
    public void showToolbar(String title, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarApp);
        toolbar.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.aut_primary));
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    public void goPasos(View view){
        Intent intent = new Intent(this,AUTActivity.class);
        startActivity(intent);
    }

}
