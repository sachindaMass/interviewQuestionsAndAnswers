/*
 * @created 07/03/2023 - 5:43 PM
 * @project interviewQuestionsAndAnswers
 * @author  Dell-PC
 */
package com.example.interviewquestionsandanswers.oopExample;

public class Mouse1 extends Mouse {
//    to inherit all properties of parent class into itself is called inheritance
//    it is also known as "is-a" relationship

//    types of inheritance supported by java :::
//    1. single      (one class pro to other)
//    2. multilevel  (one class pro to a and a class to b class pro to another)
//    3. hierarchical  (one class pro to a class and b class)
//    Method Overriding

    String texture = "Matte";

//    public void leftClick(){
//        System.out.println("Click!");
//    }
//    public void rightClick(){
//        System.out.println("Click!");
//
//    }

    public void setColor(String color){
        System.out.println(color);
    }
}
