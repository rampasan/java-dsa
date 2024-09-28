package com.LinearSearch;

// Question: Search in Range
// E.g. arr = [18, 12, -7, -2, 3, 5, 16]
// Question: Search for 3 in the range of indexes [1 - 4]
// Search in a subset of the data for target element

public class Question2 {
    public static void main(String[] args) {
        int[] array = {18, 12, -7, 3, 14, 28};
        int target = 3;
        int start = 1;
        int end = 4;
        System.out.println(linearSearch(array, target, start, end));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            // Check for element at every index if is equal to target
            if (arr[i] == target){
                return i;
            }
        }
        // If target not found
        return -1;
    }
}
