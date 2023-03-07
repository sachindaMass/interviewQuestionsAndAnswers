/*
 * @created 07/03/2023 - 9:13 PM
 * @project interviewQuestionsAndAnswers
 * @author  Dell-PC
 */
package com.example.interviewquestionsandanswers.stackExample;

import java.util.Stack;

public class StackExample {

    public void stackMethod() {
        Stack<String> games = new Stack();

        games.add("Call Of Duty");
        games.add("Guitar Hero");
        games.add("Super MonKey ball");

        System.out.println("games.peek() = " + games.peek());
        System.out.println("games = " + games);

        System.out.println("games.pop() = " + games.pop());

        System.out.println("games.peek() = " + games.peek());

        System.out.println("games = " + games);

        System.out.println("games.peek() = " + games.peek());
        System.out.println("games.pop() = " + games.pop());

        System.out.println("games.peek() = " + games.peek());
        System.out.println("games = " + games);

    }
}
