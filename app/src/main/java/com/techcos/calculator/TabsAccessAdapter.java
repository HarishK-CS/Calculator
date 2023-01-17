package com.techcos.calculator;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAccessAdapter extends FragmentPagerAdapter {


    public TabsAccessAdapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Calculator calFrgment=new Calculator();
                return calFrgment;
            case 1:
                ExchangeRate exFrgment=new ExchangeRate();
                return exFrgment;
            case 2:
                UnitConverter unitConverterFragment = new UnitConverter();
                return unitConverterFragment;


            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:
                return "Calculator";
            case 1:
                return "Exchange Rate";
            case 2:
                return "Unit Converter";
            default:
                return null;
        }

    }
}
