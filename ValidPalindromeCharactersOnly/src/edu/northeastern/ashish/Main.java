package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        System.out.println(validPalindromeCharOnly("race a car"));
    }

    private static boolean  validPalindromeCharOnly(String str){
        int start = 0;
        int end = str.length() -1;
        while(start < end){
            if( !Character.isLetter( str.charAt(start) ) ){
                start++;
                continue;
            }
            if( !Character.isLetter( str.charAt(end) ) ){
                end--;
                continue;
            }

            Character ch1 = Character.toLowerCase(str.charAt(start));
            Character ch2 = Character.toLowerCase(str.charAt(end));

            if(ch1 != ch2)
                return false;
            start++;
            end--;

        }

        return true;

    }
}
