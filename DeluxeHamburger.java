package com.company;

import java.util.Scanner;

public class DeluxeHamburger extends Hamburger {

    private final int soda = 8;
    private final int fries = 6;
    private int deluxeBurgerBasePrice = getHamburgerBasePrice() + soda + fries;

    public DeluxeHamburger(String breadRollType, String meatType) {
        super(breadRollType, meatType);
    }

    @Override
    public int Price() {
        int DeluxeHamburgerPrice = deluxeBurgerBasePrice;
        return DeluxeHamburgerPrice;
    }

    @Override
    public int Extras (){

        System.out.println("Extras are not allowed in deluxe hamburger");
        return -1;

    }



}
