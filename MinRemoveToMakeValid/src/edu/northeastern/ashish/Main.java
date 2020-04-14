package edu.northeastern.ashish;

import java.util.HashSet;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeMinParenthesis("a)b(c)d"));
    }


    private static String removeMinParenthesis(String str){
        HashSet<Integer> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < str.length(); i ++){
            if(str.charAt(i) == '('){
                stack.push(i);
            }
            if(str.charAt(i) == ')'){
                if(stack.isEmpty()){
                    set.add(i);
                }else{
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty()){
            set.add(stack.pop());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length(); i ++){
            if(!set.contains(i)){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
