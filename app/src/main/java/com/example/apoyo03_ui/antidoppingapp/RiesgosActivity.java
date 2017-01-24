package com.example.apoyo03_ui.antidoppingapp;

import android.support.design.widget.TabLayout;
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

public class RiesgosActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riesgos);
        showToolbar("Riesgos del Dopaje",true);
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.riesgo_primary_dark));
        }

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.icon_salud);
        tabLayout.getTabAt(1).setIcon(R.drawable.icon_deporte);



    }

        public void showToolbar(String title, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarApp);
        toolbar.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.riesgo_primary));
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    public static class PlaceholderFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {}
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
                    rootView = inflater.inflate(R.layout.fragment_salud, container, false);
                    break;
                case 2:
                    rootView = inflater.inflate(R.layout.fragment_deporte, container, false);
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
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Salud";
                case 1:
                    return "Deporte";
            }
            return null;
        }
    }
}


//public class RiesgosActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_riesgos);
//        showToolbar("Riesgos del Dopaje",true);
//        if (android.os.Build.VERSION.SDK_INT >= 21) {
//            Window window = this.getWindow();
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.riesgo_primary_dark));
//        }
//        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
//        bottomBar.setDefaultTab(R.id.tab_salud);
//
//
//        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
//            @Override
//            public void onTabSelected(@IdRes int tabId) {
//                if (tabId == R.id.tab_deporte) {
//                    DeporteFragment deporteFragment = new DeporteFragment();
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
//                    fragmentTransaction.replace(R.id.contentContainer,deporteFragment);
//                    fragmentTransaction.addToBackStack(null).commit();
//                }
//                if (tabId == R.id.tab_salud) {
//                    SaludFragment saludFragment = new SaludFragment();
//                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction1.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
//                    fragmentTransaction1.replace(R.id.contentContainer,saludFragment);
//                    fragmentTransaction1.addToBackStack(null).commit();
//                }
//            }
//        });
//    }
//
//    public void showToolbar(String title, boolean upButton){
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarApp);
//        toolbar.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.riesgo_primary));
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle(title);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
//    }
//}
