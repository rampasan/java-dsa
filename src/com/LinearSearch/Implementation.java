package com.LinearSearch;

public class Implementation {
    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};

        int target = 199;

        int index = linearSearch(arr, target);

        System.out.println(index);
    }

    // Search in the array: return index if item found, -1 if not
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            // Check for element at every index if is equal to target
            if (arr[i] == target){
                return i;
            }
        }
        // If target not found
        return -1;
    }

    // Search the target and return the element itself
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }

        // Enhanced for loop
        // For element in array
        for (int element : arr) {
            // Check for element at every index if is equal to target
            if (element == target){
                return element;
            }
        }
        // Because -1 might be in the array
        return Integer.MAX_VALUE;
    }

    // Search the target and return a true or false
    static boolean linearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }

        // Enhanced for loop
        // For element in array
        for (int element : arr) {
            // Check for element at every index if is equal to target
            if (element == target){
                return true;
            }
        }
        // If target not found
        return false;
    }
}
