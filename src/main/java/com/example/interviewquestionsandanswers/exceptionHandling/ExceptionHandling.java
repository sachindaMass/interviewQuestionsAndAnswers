package com.example.interviewquestionsandanswers.exceptionHandling;

public class ExceptionHandling {

//    int myInt = Integer.parseInt("pants"); // Exception in thread "main" java.lang.NumberFormatException:
    // For input string: "pants"

//    public int getMyInt() {
//        return myInt;
//    }
//
//    public void setMyInt(int myInt) {
//        this.myInt = myInt;
//    }

    public void numberFormatExceptionCheck() {
        try {
            int myInt = Integer.parseInt("pants");
//            int myInt = Integer.parseInt("1");
        } catch (NumberFormatException nfe) {
            System.out.println("Hey dude you can not make int out of that. Stop trying to do that");
        } catch (NullPointerException npe) { // multiCatch Statement
            System.out.println("Hey dude you can not make int out of that. Stop trying to do that");
        } finally { // it always runs
            System.out.println("in the finally block");
        }
//        catch (Exception e) {
//            System.out.println("Hey dude you can not make int out of that. Stop trying to do that");
//        }
//        System.out.println("End Here");
    }

//    java.lang.Object
//        java.lang.Throwable
//            java.lang.Exception
//                java.lang.RuntimeException
//                    java.lang.IllegalArgumentException
//                        java.lang.NumberFormatException

}
