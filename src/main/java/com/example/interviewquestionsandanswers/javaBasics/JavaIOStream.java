package com.example.interviewquestionsandanswers.javaBasics;

import java.io.*;

public class JavaIOStream {
//    Q: What are I/O streams in Java?
//
//A: I/O streams in Java are used to read and write data between a program and external sources,
// such as files, network sockets, and other input/output devices.
// There are two types of I/O streams in Java: input streams for reading data and output streams for writing data.

//    Q: What is the difference between byte stream and character stream in Java?
//
//A: Byte streams are used for reading and writing binary data, such as images and audio files,
// while character streams are used for reading and writing textual data. Byte streams use InputStream and OutputStream classes,
// while character streams use Reader and Writer classes.

//    Q: How do you read data from a file in Java?
//
//A: You can read data from a file in Java using the FileInputStream class. Here's an example of reading data from a file:

    public void readDataFromAFile(){
        try {
            FileInputStream input = new FileInputStream("file.txt");
            int data;
            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    Q: How do you write data to a file in Java?
//
//A: You can write data to a file in Java using the FileOutputStream class. Here's an example of writing data to a file:

    public void writeDataFile(){
        try {
            FileOutputStream output = new FileOutputStream("file.txt");
            String text = "Hello, world!";
            byte[] data = text.getBytes();
            output.write(data);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//    Q: What is serialization in Java?
//
//A: Serialization in Java is the process of converting an object into a byte stream so that it can be stored in a file or sent over a network.
// Deserialization is the process of converting the byte stream back into an object.
// Java provides the Serializable interface that can be implemented by a class to enable serialization.
//
//Q: How do you serialize an object in Java?
//
//A: You can serialize an object in Java using the ObjectOutputStream class. Here's an example of serializing an object:

    public void serializationJava(){
        try {
            FileOutputStream fileOut = new FileOutputStream("object.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            MyClass object = new MyClass();
//            out.writeObject(object);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    Q: How do you deserialize an object in Java?
//
//A: You can deserialize an object in Java using the ObjectInputStream class. Here's an example of deserializing an object:

    public void deserializeJava(){
        try {
            FileInputStream fileIn = new FileInputStream("object.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
//            MyClass object = (MyClass) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
