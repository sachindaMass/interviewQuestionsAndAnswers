package com.example.interviewquestionsandanswers.equalVsEquals;

public class EqualDemo {

    public void equalCheck() {

        int int1 = 3;
        int int2 = 4;

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        if (int1 == int2) {
            System.out.println("The Numbers are equal");
        } else {
            System.out.println("The numbers are not equal");
        }

        if (s1 == s2) {
            System.out.println("The String are equal with using ==");
        } else {
            System.out.println("The String are not equal with using ==");
        }

        if (s1.equals(s2)) {
            System.out.println("The String are equal with using equal");
        } else {
            System.out.println("The String are not equal with using equal");
        }
    }
}
