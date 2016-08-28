package com.jari.example.navigationdrawer.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jari.example.navigationdrawer.R;

/**
 * Created by Jonnathan on 15/08/2016.
 */
public class FragmentInicial extends Fragment{

    private Toolbar toolbar;
    private int _ultimaPosicion;


    FragmentEmpleoPorConvocatoria _fragmentEmpleoPorConvocatoria = null;

    ViewPager viewPager = null;
    ViewPagerAdapter adapter = null;
    TabLayout tabLayout = null;
    View view = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //final View
        if (view == null)
                view = inflater.inflate(R.layout.fragment_inicial, container, false);

//        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
//        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
//
//        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //final TabLayout
                if(tabLayout == null) {
                    tabLayout = (TabLayout) view.findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);

                    tabLayout.addTab(tabLayout.newTab().setText("CONVOCATORIA"));
                    tabLayout.addTab(tabLayout.newTab().setText("RANGO"));
                    tabLayout.addTab(tabLayout.newTab().setText("DEPARTAMENTO"));
                }

        //final ViewPager
        if(viewPager == null)
                viewPager = (ViewPager) view.findViewById(R.id.viewpager);
//        setupViewPager(viewPager);
        //final ViewPagerAdapter
        if(adapter == null) {
            adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager(), tabLayout.getTabCount());
            viewPager.setAdapter(adapter);

            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


            tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {
                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {
                }
            });
        } else {
            viewPager.setCurrentItem(_ultimaPosicion);
        }

//        new Handler().postDelayed(
//                new Runnable(){
//                    @Override
//                    public void run() {
//                        tabLayout.getTabAt(0).select();
//                        viewPager.setCurrentItem(0);
//                    }
//                }, 100);
        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        viewPager = (ViewPager) findViewById(R.id.viewpager);
//        setupViewPager(viewPager);
//
//        tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);
//    }

//    private void setupViewPager(ViewPager viewPager) {
//
//        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());
//        adapter.addFragment(new FragmentEmpleoPorConvocatoria(), "CATEG");
//        adapter.addFragment(new FragmentEmpleoPorRango(), "RANGO");
//        adapter.addFragment(new FragmentEmpleoPorDepartamento(), "DPTO");
//        viewPager.setAdapter(adapter);
//    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        int mNumOfTabs;
        public ViewPagerAdapter(FragmentManager fm, int NumOfTabs) {
            super(fm);
            this.mNumOfTabs = NumOfTabs;
        }
        @Override
        public Fragment getItem(int position) {
            _ultimaPosicion = position;
            switch (position) {
                case 0:
                    if(_fragmentEmpleoPorConvocatoria == null)
                        _fragmentEmpleoPorConvocatoria = new FragmentEmpleoPorConvocatoria();
                    //FragmentEmpleoPorConvocatoria tab1 = new FragmentEmpleoPorConvocatoria();

                    return _fragmentEmpleoPorConvocatoria;
                case 1:
                    FragmentEmpleoPorRango tab2 = new FragmentEmpleoPorRango();
                    return tab2;
                case 2:
                    FragmentEmpleoPorDepartamento tab3 = new FragmentEmpleoPorDepartamento();
                    return tab3;
                default:
                    return null;
            }
        }
        @Override
        public int getCount() {
            return mNumOfTabs;
        }
    }

//    class ViewPagerAdapter extends FragmentPagerAdapter {
//        private final List<Fragment> mFragmentList = new ArrayList<>();
//        private final List<String> mFragmentTitleList = new ArrayList<>();
//
//        public ViewPagerAdapter(FragmentManager manager) {
//            super(manager);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return mFragmentList.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return mFragmentList.size();
//        }
//
//        public void addFragment(Fragment fragment, String title) {
//            mFragmentList.add(fragment);
//            mFragmentTitleList.add(title);
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return mFragmentTitleList.get(position);
//        }
//    }
}
