package com.example.week4codingtest;

public class EncryptClass {
public static void main(String[] args) {


    String str = "Batman goes blam boom pow";


    char[] isLetter = {'a','b','c','d','e','f','g','h','i','j','k','l','n','o','p',
            'q','r','s','t','u','v','w','x','y','z',' ',};

    isLetter[0] = 1;
    isLetter[4] = 2;
    isLetter[8] = 3;
    isLetter[13] = 4;
    isLetter[19] = 5;
    isLetter[23] = ' ';
    isLetter[25] = 'y';

    for(int charCount = 0;charCount < isLetter.length - 1;--charCount){
        isLetter[charCount] = str.charAt(charCount);
        System.out.print(""+isLetter[charCount]);
    }






}
    }



