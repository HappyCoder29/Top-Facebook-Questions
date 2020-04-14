package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        System.out.printf(addTwoStrings("97","23"));
    }

    public static String addTwoStrings(String str1, String str2){

        StringBuilder sb = new StringBuilder();

        int len1 = str1.length() -1;
        int len2 = str1.length() -1;


        int sum = 0;
        while(len1 >= 0 || len2 >=0){
            if(len1 >=0){
                sum += str1.charAt(len1) -'0';
                len1--;
            }
            if(len2 >=0){
                sum += str2.charAt(len2) -'0';
                len2--;
            }

            sb.append(sum % 10);
            sum = sum > 9 ? 1: 0;

        }
        if(sum >0)
            sb.append("1");



        return  sb.reverse().toString();

    }
}
