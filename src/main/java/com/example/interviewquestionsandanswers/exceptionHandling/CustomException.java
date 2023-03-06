package com.example.interviewquestionsandanswers.exceptionHandling;

public class CustomException {

    public void validateAge(int age) throws AgeLessThanZeroException{
        if(age < 0){
//            throw new Exception("Oh No! Something went wrong");
//            throw new AgeLessThanZeroException("Age can not be negative");
//            throw new AgeLessThanZeroException(new RuntimeException());
            throw new AgeLessThanZeroException("Oh No!",new RuntimeException());
        }
    }
}
