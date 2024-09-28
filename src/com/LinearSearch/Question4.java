package com.LinearSearch;

// Question: Search in a 2D Array

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3 , 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 3;
        int[] answer = search(arr, target); // Returns {row, column}
        System.out.println(Arrays.toString(answer));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target){
                    return new int[]{row, column};
                }
            }
        }

        return new int[]{-1, -1};
    }

    // Find maximum value in 2D Array
    static int max(int[][] arr){
        int maximum = arr[0][0];
        for (int[] row : arr) {
            for (int column : row) {
                if (column > maximum) {
                    maximum = column;
                }
            }
        }

        return maximum;
    }
}
