package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1};
        System.out.println(getFirstBadVersion(arr));
    }

    private static int getFirstBadVersion(int[] arr){
        int start = 0;
        int end = arr.length -1;

        if(arr[start] ==1){
            return 0;
        }

        while(start < end){
            int mid = (start + end)/2;
            if(arr[mid] == 1){
                end = mid;
            }else{
                start = mid+1;
            }
        }


        return start;

    }
}
