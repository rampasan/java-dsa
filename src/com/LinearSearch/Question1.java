package com.LinearSearch;

// Question: Search in String

public class Question1 {
    public static void main(String[] args) {
        String name = "Prashanth";
        char target = 't';
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }

    // For each approach
    static boolean search2(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }

        return false;
    }
}
