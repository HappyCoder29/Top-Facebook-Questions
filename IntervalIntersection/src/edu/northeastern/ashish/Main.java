package edu.northeastern.ashish;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Interval> list1 = new ArrayList<>();
        ArrayList<Interval> list2 = new ArrayList<>();

        list1.add(new Interval(0,2));
        list1.add(new Interval(5,10));
        list1.add(new Interval(13,23));
        list1.add(new Interval(24,25));

        list2.add(new Interval(1,5));
        list2.add(new Interval(8,12));
        list2.add(new Interval(15,24));
        list2.add(new Interval(25,26));

        ArrayList<Interval> result = getIntersection(list1, list2);
        System.out.println("");
    }


    private static ArrayList<Interval> getIntersection (ArrayList<Interval> interval1,
                                                        ArrayList<Interval> interval2){

        IntervalComparision comparator = new IntervalComparision();
        interval1.sort(comparator);
        interval2.sort(comparator);

        int index1 = 0;
        int index2 = 0;

        ArrayList<Interval> result = new ArrayList<>();

        while(index1< interval1.size() && index2 < interval2.size()){

            Interval A = interval1.get(index1);
            Interval B = interval2.get(index2);

            if(A.end < B.start){
                index1 ++;
            }
            else if (B.end < A.start){
                index2++;
            }
            else if (A.start >= B.start && A.end <= B.end) {
                result.add(new Interval(A.start, A.end));
                index1++;
            }
            else if(B.start >= A.start && B.end <= A.end) {
                result.add(new Interval(B.start, B.end));
                index2++;
            }
            else if ( A.start <= B.start && A.end  >=B.start){
                result.add(new Interval(B.start, A.end));
                index1++;
            }
            else if (B.start <= A.start && B.end >= A.start){
                result.add(new Interval(A.start, B.end));
                index2++;
            }
        }

        return  result;
    }
}
