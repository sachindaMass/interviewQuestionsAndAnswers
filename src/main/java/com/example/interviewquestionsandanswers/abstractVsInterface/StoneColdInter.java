package com.example.interviewquestionsandanswers.abstractVsInterface;

public class StoneColdInter implements WrestlerInterface {
    @Override
    public void themeMusic() {
        System.out.println("Stone Cold Intro Music");
    }

    @Override
    public void finisher() {
        System.out.println("stunner");
    }

    @Override
    public void paymentForWork(int hours) {
        System.out.println("Stone cold will make $" + hours * 300.00 + "for his match");
    }
}
