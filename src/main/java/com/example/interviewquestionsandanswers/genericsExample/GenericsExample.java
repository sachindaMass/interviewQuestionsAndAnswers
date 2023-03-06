package com.example.interviewquestionsandanswers.genericsExample;

import java.io.Serializable;

public class GenericsExample<T extends Serializable> {

    //    Integer thingToPrint;
    T thingToPrint;

    public GenericsExample() {
    }

//    public GenericsExample(Integer thingToPrint) {
//        this.thingToPrint = thingToPrint;
//    }

    public GenericsExample(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

//    public Integer getThingToPrint() {
//        return thingToPrint;
//    }

    public T getThingToPrint() {
        return thingToPrint;
    }

//    public void setThingToPrint(Integer thingToPrint) {
//        this.thingToPrint = thingToPrint;
//    }

    public void setThingToPrint(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public <T> void shout(T thingToShout) {
        System.out.println(thingToShout + "!!!!!");
    }

    public <T, V> void shout1(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!!");
    }

    public <T, V> T shout2(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!!");

        return thingToShout;
    }
}
