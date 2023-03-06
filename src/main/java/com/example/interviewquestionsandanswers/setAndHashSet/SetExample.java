package com.example.interviewquestionsandanswers.setAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

    Set<String> namesSet = new HashSet<>();

    List<Integer> numberList = new ArrayList<>();

    public List<Integer> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public Set<String> getNamesSet() {
        return namesSet;
    }

    public void setNamesSet(Set<String> namesSet) {
        this.namesSet = namesSet;
    }
}
