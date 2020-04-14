package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,5,6};
        int[] result = mergeSortedArraysRecursive(arr1, arr2);
        System.out.printf("");

    }

    private static int[] mergeSortedArrays(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+ arr2.length];
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while(index1 < arr1.length && index2 < arr2.length){
            if(arr1[index1] < arr2[index2]){
                result[index++ ] = arr1[index1++];
            }else{
                result[index++ ] = arr2[index2++];
            }
        }

        while(index1 < arr1.length){
            result[index++ ] = arr1[index1++];
        }
        while(index2 < arr2.length){
            result[index++ ] = arr2[index2++];
        }

        return  result;

    }


    private static  int[] mergeSortedArraysRecursive(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+ arr2.length];
        int index1 = 0;
        int index2 = 0;
        int index = 0;

        mergeSortedArraysRecursive(arr1, arr2, result, index1, index2, index);
        return  result;
    }

    private static void mergeSortedArraysRecursive( int[] arr1,
                                                    int[] arr2,
                                                    int[] result,
                                                    int index1,
                                                    int index2,
                                                    int index
                                                    ){
        if( index1 < arr1.length && index2 < arr2.length){
            if(arr1[index1] < arr2[index2]){
                result[index++ ] = arr1[index1++];
            }else{
                result[index++ ] = arr2[index2++];
            }
            mergeSortedArraysRecursive(arr1, arr2, result, index1, index2, index);
        }
        else if (index1 < arr1.length){
            result[index++ ] = arr1[index1++];
            mergeSortedArraysRecursive(arr1, arr2, result, index1, index2, index);
        }
        else if(index2 < arr2.length){
            result[index++ ] = arr2[index2++];
            mergeSortedArraysRecursive(arr1, arr2, result, index1, index2, index);
        }
    }



}
