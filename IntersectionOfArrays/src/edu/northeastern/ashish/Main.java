package edu.northeastern.ashish;

import com.sun.jdi.IntegerType;

import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

        Integer[] result = getIntersection(arr1, arr2);
        System.out.println("");
    }

    private static Integer[] getIntersection(int[] arr1, int[] arr2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : arr1) { set1.add(i);}
        for (int i : arr2) { set2.add(i);}

        LinkedList<Integer> list = new LinkedList<>();

        if(set1.size() > set2.size()){
            for (Integer i: set2) {
                if(set1.contains(i))
                    list.add(i);
            }
        }else{
            for (Integer i: set1) {
                if(set2.contains(i))
                    list.add(i);
            }
        }

        Integer[] result = new Integer[list.size()];
        result = list.toArray(result);

        return  result;
    }

}
