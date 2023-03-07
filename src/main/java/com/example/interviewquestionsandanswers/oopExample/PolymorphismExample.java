/*
 * @created 07/03/2023 - 5:16 PM
 * @project interviewQuestionsAndAnswers
 * @author  Dell-PC
 */
package com.example.interviewquestionsandanswers.oopExample;

public class PolymorphismExample {

//    poly means        ( many )
//    morphism  mean    ( Form )
//    polymorphism      ( many forms )
//
//    example of polymorphism :::
//    1. water has many forms  ( solid , liquid , gas )
//    2. shapes has many forms ( circle , rectangle , square )
//    3. sound has many forms  ( loin , male , female  )

//    method OverLoading

    private String name;
    private String color;

    public PolymorphismExample() {
    }

    public PolymorphismExample(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("much");
    }
}
