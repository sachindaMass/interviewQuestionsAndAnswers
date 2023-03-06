package com.example.interviewquestionsandanswers.enumExample;

public enum Cereals {

    CAPTAIN_CRUNCH(50),
    FROOT_LOOPS(60),
    REESES_PUFFES(100),
    COCA_PUFF(75);

    public int getLevelOfDeliciousness() {
        return levelOfDeliciousness;
    }

    final int levelOfDeliciousness;

    Cereals(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}
