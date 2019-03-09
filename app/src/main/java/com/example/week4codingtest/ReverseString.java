package com.example.week4codingtest;

public class ReverseString {

        public static void main(String[] args) {
            String str = "Sherlock Holmes";
            int l = str.length();
            for (int i = l; i > 0; i--) {
                System.out.print(str.charAt(i-1));
            }
        }
}
