package com.example.interviewquestionsandanswers.multithreadExample;

public class MultiThreadExmple2 implements Runnable {

    private final int threadNumber;

    public MultiThreadExmple2(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);
//            if (threadNumber == 3){
//                throw new RuntimeException();
//            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
//                e.printStackTrace();
            }
        }
    }
}
