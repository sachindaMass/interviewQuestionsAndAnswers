/*
 * @created 07/03/2023 - 3:16 PM
 * @project interviewQuestionsAndAnswers
 * @author  Sachinda-Marasinghe
 */
package com.example.interviewquestionsandanswers.oopExample;

public class Pen {

    String type = "gel";
    String color = "blue";
    int point = 10;
    boolean clicked = false;

    public Pen() {

    }

    public Pen(String type, String color, int point, boolean clicked) {
        this.type = type;
        this.color = color;
        this.point = point;
        this.clicked = clicked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }


    public void testSystemOutPrintln() {
        System.out.println("Hello World");

        int a = 0;
        if (a == 0) {
            System.out.println("a is zero");
        }
    }

    public boolean penClick() {
        clicked = true;
        return true;
    }

    public boolean unClicked() {
        clicked = false;
        return false;
    }


}
