package com.example.interviewquestionsandanswers.recordsExamples;

public record EmployeeRecord(String name, int empNumber) { // generate final fields, generate getters
                                                            // certain type of constructor.

    public String nameInUpperCase(){
        return name.toUpperCase();
    }
}
