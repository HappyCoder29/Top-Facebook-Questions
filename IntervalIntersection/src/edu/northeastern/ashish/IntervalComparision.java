package edu.northeastern.ashish;

import java.util.Comparator;

public class IntervalComparision implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        Interval x = (Interval)o;
        Interval y = (Interval) t1;
        if(x.start > y.start){
            return 1;
        }
        else if (x.start < y.start){
            return  -1;
        }else {
            return 0;
        }
    }
}
