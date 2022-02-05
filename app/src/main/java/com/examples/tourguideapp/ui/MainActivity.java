package com.examples.tourguideapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.examples.tourguideapp.model.Category;
import com.examples.tourguideapp.Adapters.PagerAdapter;
import com.examples.tourguideapp.R;
import com.examples.tourguideapp.model.itemCategory;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TabLayout main_tab;
    ViewPager main_Pager;

    ArrayList<Category> categories = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_tab = findViewById(R.id.mani_tabLayout);
        main_Pager = findViewById(R.id.main_viewPager);

        main_tab.setupWithViewPager(main_Pager);

        categories.add(new Category(BlankFragment.newInstance(getlistUNI()), getString(R.string.UNI)));
        categories.add(new Category(BlankFragment.newInstance(getlistCitys()), getString(R.string.CiT)));
        categories.add(new Category(BlankFragment.newInstance(getlistEvents()), getString(R.string.events)));
        categories.add(new Category(BlankFragment.newInstance(getlistRestaurants()),getString(R.string.restaurants)));

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), categories);

        main_Pager.setAdapter(adapter);


    }

    private ArrayList<itemCategory> getlistRestaurants() {
        ArrayList<itemCategory> listRestaurants=new ArrayList<>();
      listRestaurants.add(new itemCategory(R.drawable.chouse,getString(R.string.chouseName),getString(R.string.chousedisc)));
      listRestaurants.add(new itemCategory(R.drawable.brea,getString(R.string.brekName),getString(R.string.brekdisc)));
      listRestaurants.add(new itemCategory(R.drawable.tabon,getString(R.string.tabonName),getString(R.string.tabondisc)));
      listRestaurants.add(new itemCategory(R.drawable.snounu,getString(R.string.snounuName),getString(R.string.snounudisc)));
        return listRestaurants;
    }

    private ArrayList<itemCategory> getlistEvents() {
        ArrayList<itemCategory> listEvents = new ArrayList<>();
        listEvents.add(new itemCategory(R.drawable.wara, getString(R.string.wara), getString(R.string.waraDisc)));
        listEvents.add(new itemCategory(R.drawable.wearb, getString(R.string.warb), getString(R.string.warbDisc)));
        listEvents.add(new itemCategory(R.drawable.warc, getString(R.string.warc), getString(R.string.warcDisc)));
        listEvents.add(new itemCategory(R.drawable.ward, getString(R.string.ward), getString(R.string.wardDisc)));
        return listEvents;
    }

    private ArrayList<itemCategory> getlistCitys() {
        ArrayList<itemCategory> listCitys = new ArrayList<>();
        listCitys.add(new itemCategory(R.drawable.rafah, getString(R.string.rafah), getString(R.string.rafahDisc)));
        listCitys.add(new itemCategory(R.drawable.khanyunis, getString(R.string.khanyunisName), getString(R.string.khanyunisDisc)));
        listCitys.add(new itemCategory(R.drawable.jabalia, getString(R.string.JabaliaName), getString(R.string.JabaliaDisc)));
        listCitys.add(new itemCategory(R.drawable.deiralbalah, getString(R.string.deiralbalahName), getString(R.string.deiralbalahDisc)));
        return listCitys;
    }

    private ArrayList<itemCategory> getlistUNI() {
        ArrayList<itemCategory> listUNI = new ArrayList<>();
        listUNI.add(new itemCategory(R.drawable.islamic, getString(R.string.islamicUni), getString(R.string.IslamicDisc)));
        listUNI.add(new itemCategory(R.drawable.alazhar, getString(R.string.AlAzhaName), getString(R.string.AlAzharDisc)));
        listUNI.add(new itemCategory(R.drawable.alaqsa, getString(R.string.alaqsaName), getString(R.string.alaqsaDisc)));
        listUNI.add(new itemCategory(R.drawable.alquds, getString(R.string.alqudsName), getString(R.string.alqudsDisc)));

        return listUNI;
    }
}