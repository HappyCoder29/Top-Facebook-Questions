package edu.northeastern.ashish;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
    private static String getGoatLatin(String str){
        HashSet<Character> set = new HashSet<>();
        Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for (Character c : vowels) {
            set.add(c);
        }

        int count = 1;
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s: words) {
            Character ch = s.charAt(0);
            if(set.contains(ch)){
                sb.append(s);
            }else{
                sb.append(s.substring(1));
                sb.append(s.substring(0,1));
            }
            sb.append("ma");

            for(int i = 0 ; i <  count; i ++){
                sb.append("a");
            }
            count++;
            sb.append(" ");
        }
        return  sb.toString();

    }
}
