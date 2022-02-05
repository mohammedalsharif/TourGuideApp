package com.examples.tourguideapp.model;

import androidx.fragment.app.Fragment;

public class Category {
   private Fragment fragment;
   private String tabName;

    public Category(Fragment fragment, String tabName) {
        this.fragment = fragment;
        this.tabName = tabName;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public String getTabName() {
        return tabName;
    }
}
