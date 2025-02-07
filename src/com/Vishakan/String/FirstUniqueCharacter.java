package com.Vishakan.String;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(findTheFirstSingleChar("abdacba"));
    }
    static char findTheFirstSingleChar(String str) {
        int[] freq = new int[26];
        for (char c : str.toCharArray()) {
            freq[c - 'a'] ++;
        }
        for (char c : str.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }
        return '\0';
    }
}
