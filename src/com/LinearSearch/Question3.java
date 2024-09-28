package com.LinearSearch;

// Question: Find minimum number

public class Question3 {
    public static void main(String[] args) {
        int[] array = {18, 12, -7, 3, 14, 28};

        System.out.println(min(array));
    }

    // assume arr.length !== 0
    // return the minimum value of the array
    static int min(int[] arr){
        int lowest = arr[0];

        for (int element : arr) {
            if (element < lowest){
                lowest = element;
            }
        }

        return lowest;
    }
}
