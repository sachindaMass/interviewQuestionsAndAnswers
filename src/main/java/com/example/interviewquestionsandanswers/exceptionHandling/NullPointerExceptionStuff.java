package com.example.interviewquestionsandanswers.exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class NullPointerExceptionStuff {

    public void myCat() {
        Cat myCat = new Cat();
//        Cat myCat = null;
        if (myCat != null) {
            myCat.makeNoise();
        }
    }

    public void booleanNullCheck() {
        boolean shouldPrintHello = true; // primitive boolean can never have the null value
//        Boolean shouldPrintHello = null;  // Wrapper class Boolean can have null value

        if (shouldPrintHello) {
            System.out.println("Hello");
        }
    }

    public void listNullCheck() {
//        List<String> favoriteCheeseBurger = null;
        List<String> favoriteCheeseBurger = new ArrayList<>();

        for (String burger : favoriteCheeseBurger) {
            System.out.println(burger);
        }
    }

    public List<Cat> listCats() {
        List<Cat> cats = new ArrayList<>();
        Cat myOtherCat = new Cat();

        myOtherCat.setName("Jerry");
        if (myOtherCat.getName().equals("Newman")) {
            System.out.println("Hello NewMan");
        }
        cats.add(myOtherCat);
        System.out.println(getFirstCatNameLength(cats));
        return cats;
    }


    public int getFirstCatNameLength(List<Cat> cats) {

        if (cats != null &&
                cats.get(0) != null &&
                cats.get(0).getName() != null) {
            return cats.get(0).getName().length();
        }
        return 0;
    }

    public List<Cat> getCats() {
        return new ArrayList<>();
    }
}
