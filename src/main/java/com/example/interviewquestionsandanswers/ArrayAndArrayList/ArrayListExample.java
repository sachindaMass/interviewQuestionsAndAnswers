package com.example.interviewquestionsandanswers.ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

    //ArrayList can only hold objects, But support wrapper types for primitives

    ArrayList<String> friendsArrayList = new ArrayList<>(); // do not have original size

    ArrayList<String> friendsArrayList2
            = new ArrayList<>(Arrays.asList("John","Chirs","Reic","Luke"));

    public ArrayList<String> getFriendsArrayList() {
        return friendsArrayList;
    }

    public ArrayList<String> getFriendsArrayList2() {
        return friendsArrayList2;
    }
}
