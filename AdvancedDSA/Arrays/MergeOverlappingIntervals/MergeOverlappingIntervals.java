package AdvancedDSA.Arrays.MergeOverlappingIntervals;

import java.util.ArrayList;
import java.util.Collections;

import AdvancedDSA.Arrays.Interval;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        System.out.println("Hello World");

        ArrayList<Interval> ip = new ArrayList<Interval>();
        Interval i1 = new Interval(1, 3);
        ip.add(i1);
        i1 = new Interval(2, 6);
        ip.add(i1);
        i1 = new Interval(8, 10);
        ip.add(i1);
        i1 = new Interval(15, 18);
        ip.add(i1);
    
    
        ArrayList<Interval> output = merge(ip);

        System.out.println();
        for(int i = 0; i < output.size(); i++){
           System.out.print("(" + output.get(i).start + "," + output.get(i).end + ")");
        }
        System.out.println();
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if(intervals.size()<=1)
                return intervals;
        Collections.sort(intervals,(i1,i2)->i1.start-i2.start);
        ArrayList<Interval> arr = new ArrayList<>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for(Interval i : intervals)
        {
            if(i.start<=end)
                end = Math.max(end, i.end);
            else
            {
                arr.add(new Interval(start,end));
                start = i.start;
                end = i.end;
            }
        }
        arr.add(new Interval(start,end));
        return arr;
    }
}

