package com.ll.level0.p120906;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int answer=0;
        for(int i=9999; i>=1000; i--)
            for(int j=i; j>=1000; j--)
            {
                int result = i*j;
                if(isPalindrome(result)) {
                    System.out.println(result);
                    return;
                }
            }
    }
    static boolean isPalindrome(int n ){
        String s = String.valueOf(n);
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
}

class Solution{
    int solution(int num ){
        return (num+"")
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}