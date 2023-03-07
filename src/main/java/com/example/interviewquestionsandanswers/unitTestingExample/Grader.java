/*
 * @created 07/03/2023 - 2:34 PM
 * @project interviewQuestionsAndAnswers
 * @author  Sachinda-Marasinghe
 */
package com.example.interviewquestionsandanswers.unitTestingExample;

public class Grader {

    public char determineLetterGrade(int numberGrade) {
        if (numberGrade < 0) {
            throw new IllegalArgumentException("Number grade cannot be");
        } else if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'D';
        } else if (numberGrade < 80) {
            return 'C';
        } else if (numberGrade < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
