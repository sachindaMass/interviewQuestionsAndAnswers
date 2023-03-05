package com.example.interviewquestionsandanswers;

public class OuterClass {

    int number = 6;

    public void heyThere() {
        System.out.println("Hey There");

        class LocalInnerClass{
            String localInnerClassVarible = "Here's Sachinda";

            public void printLocalInnerClassVariable(){
                System.out.println(localInnerClassVarible);
            }
        }

        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalInnerClassVariable();
    }

    public class InnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("What's up from the Inner Class");
        }
    }

}
