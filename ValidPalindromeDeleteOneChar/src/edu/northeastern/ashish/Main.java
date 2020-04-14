package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindromeDeleteAtmostOneChar("abcda"));
    }


    private static boolean isPalindromeDeleteAtmostOneChar(String str){
        int start = 0;
        int end = str.length() -1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return  isPalindrome(str, start+1, end) ||
                        isPalindrome(str, start, end-1);
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean isPalindrome(String str, int start, int end){
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return  true;
    }
}
