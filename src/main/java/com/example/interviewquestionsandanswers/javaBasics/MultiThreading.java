package com.example.interviewquestionsandanswers.javaBasics;

public class MultiThreading {

//    Q: What is multithreading in Java?
//
//A: Multithreading is a feature of Java that allows multiple threads to run concurrently within a single program.
// A thread is a lightweight sub-process that can execute independently of the other threads.
// Multithreading is used to improve the performance and responsiveness of a program.

//    Q: How do you create a thread in Java?
//
//A: There are two ways to create a thread in Java: by extending the Thread class or by implementing the Runnable interface.
// Here's an example of creating a thread by extending the Thread class:

    public void createThread() {
        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println("MyThread is running");
            }
        }
        MyThread thread = new MyThread();
        thread.start();
    }

//    Q: How do you implement synchronization in Java?
//
//A: Synchronization is used in Java to prevent multiple threads from accessing the same code block simultaneously,
// which can lead to data inconsistency and race conditions. Synchronization can be achieved in Java by using the synchronized keyword or by using locks.
// Here's an example of using the synchronized keyword:

    public void implementSynchronization() {
        class Counter {
            private int count;

            public synchronized void increment() {
                count++;
            }

            public synchronized int getCount() {
                return count;
            }
        }
        Counter counter = new Counter();
        // create and start multiple threads that call counter.increment() method
//        counter.increment();
    }

//    Q: How do you prevent a deadlock in Java?
//
//A: Deadlocks can be prevented in Java by following some best practices such as avoiding nested locks,
// acquiring locks in a specific order, and using timeouts when acquiring locks. Here's an example of using timeouts when acquiring locks:

    public void deadLockJava() {
        class Account {
            private int balance;
            private final Object lock = new Object();

            public void transfer(Account to, int amount) {
                long timeout = 1000;
                synchronized (lock) {
                    if (this.balance < amount) {
                        throw new RuntimeException("Insufficient balance");
                    }
                    this.balance -= amount;
                    synchronized (to.lock) {
                        to.balance += amount;
                    }
                }
            }
        }

    }
//Q: What is the difference between wait() and sleep() methods in Java?
//
//A: The wait() and sleep() methods are used for different purposes in Java. The wait() method is used to make a thread
// wait until another thread notifies it, while the sleep() method is used to make a thread pause for a specified amount of time.
// The wait() method is called on an object, while the sleep() method is called on a thread. Here's an example of using the wait() method:

    public void waitAndSleep() {
        class MyThread extends Thread {
            public void run() {
                synchronized (this) {
                    try {
                        System.out.println("MyThread is waiting");
                        wait();
                        System.out.println("MyThread is running again");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        MyThread thread = new MyThread();
        thread.start();
        synchronized (thread) {
            thread.notify();
        }
    }
}
