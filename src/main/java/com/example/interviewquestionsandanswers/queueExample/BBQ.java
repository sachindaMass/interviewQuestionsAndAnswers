/*
 * @created 07/03/2023 - 9:44 PM
 * @project interviewQuestionsAndAnswers
 * @author  Dell-PC
 */
package com.example.interviewquestionsandanswers.queueExample;

import java.util.LinkedList;
import java.util.Queue;

public class BBQ {

    public void queueMethod() {

        Queue<String> bbqLine = new LinkedList();

        bbqLine.add("Jackson");
        bbqLine.add("Sachin");
        bbqLine.add("Mass");
        bbqLine.add("Naveen");

        System.out.println("bbqLine = " + bbqLine);

        System.out.println("bbqLine.peek() = " + bbqLine.peek());
        System.out.println("bbqLine.poll() = " + bbqLine.poll());

        System.out.println("bbqLine = " + bbqLine);
        System.out.println("bbqLine.peek() = " + bbqLine.peek());

        System.out.println("bbqLine.poll() = " + bbqLine.poll());

        System.out.println("bbqLine.peek() = " + bbqLine.peek());
        System.out.println("bbqLine = " + bbqLine);

    }
}
