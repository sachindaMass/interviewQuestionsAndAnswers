package com.example.interviewquestionsandanswers.exceptionHandling;

public class AgeLessThanZeroException extends Exception {

    public AgeLessThanZeroException() {
    }

    public AgeLessThanZeroException(String age_can_not_be_negative) {
        super(age_can_not_be_negative);
    }

    public AgeLessThanZeroException(Throwable cause) {
        super(cause);
    }

    public AgeLessThanZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
