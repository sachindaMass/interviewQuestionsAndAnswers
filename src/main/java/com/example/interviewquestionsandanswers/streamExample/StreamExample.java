/*
 * @created 08/03/2023 - 10:24 AM
 * @project interviewQuestionsAndAnswers
 * @author  Dell-PC
 */
package com.example.interviewquestionsandanswers.streamExample;

public class StreamExample {

   public String name;
   public int billions;

   public StreamExample(){}

    public StreamExample(String name, int billions) {
        this.name = name;
        this.billions = billions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBillions() {
        return billions;
    }

    public void setBillions(int billions) {
        this.billions = billions;
    }
}
