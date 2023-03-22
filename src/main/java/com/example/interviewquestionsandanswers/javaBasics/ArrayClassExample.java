package com.example.interviewquestionsandanswers.javaBasics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayClassExample {

    // Write a java programme to find the second the smallest number in an array of integers.

    public int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < smallest) {
                secondSmallest = smallest;
                smallest = j;
            } else if (j < secondSmallest && j != smallest) {
                secondSmallest = j;
            }
        }
        System.out.println("secondSmallest = " + secondSmallest);
        return secondSmallest;
    }

//    write a java programme to sort an array of integers in descending order.

    public void sortingDescending(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }
    }

//    write a java programme to remove duplicates from an array of string.

    public String[] removeDuplicates(String[] arr) {
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        String[] result = new String[set.size()];
        int i = 0;
        for (String s : set) {
            result[i++] = s;
        }
        System.out.println("set = " + set);
        System.out.println("result = " + Arrays.toString(result));
        return new String[]{Arrays.toString(result)};
    }

//    Write a Java program to find the common elements between two arrays of integers.

//    public int[] findCommonElements(int[] arr1, int[] arr2) {
//        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
//        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
//        set1.retainAll(set2);
//        int[] result = new int[set1.size()];
//        int i = 0;
//        for (int num : set1) {
//            result[i++] = num;
//        }
//        return result;
//    }

//    Write a Java program to reverse an array of integers.

    public void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            System.out.println("arr = " + Arrays.toString(arr));
        }
    }


}
