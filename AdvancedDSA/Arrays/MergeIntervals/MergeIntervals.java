package AdvancedDSA.Arrays.MergeIntervals;

import java.util.ArrayList;
import java.util.Collections;

import AdvancedDSA.Arrays.Interval;

public class MergeIntervals {
    public static void main(String[] args) {
        
        ArrayList<Interval> ip = new ArrayList<Interval>();
        /*Interval i1 = new Interval(2, 6);
        ip.add(i1);
        i1 = new Interval(8, 10);
        ip.add(i1);
        i1 = new Interval(15, 18);
        ip.add(i1);

         ArrayList<Interval> output = insert(ip, new Interval(4, 9));

        */

        Interval i1 = new Interval(1, 3);
        ip.add(i1);
        i1 = new Interval(5, 7);
        ip.add(i1);
        i1 = new Interval(9, 11);
        ip.add(i1);
    
    
        ArrayList<Interval> output = insert(ip, new Interval(-1, 6));

        System.out.println();
        for(int i = 0; i < output.size(); i++){
           System.out.print("(" + output.get(i).start + "," + output.get(i).end + ")");
        }
        System.out.println();
    }

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> output = new ArrayList<Interval>();

        int start = newInterval.start;
        int end   = newInterval.end;
        int n     = intervals.size();
    
        for(int i = 0; i < n; i++)
        {
            if(intervals.get(i).end < start)
            {
                output.add(intervals.get(i));
            }
            else if(intervals.get(i).start > end){
                while(i < n){
                    output.add(intervals.get(i));
                   i++; 
                }
            }else{
                start = Math.min(intervals.get(i).start, start);
                end   = Math.max(intervals.get(i).end,end);
            }
        }
        output.add(new Interval(start, end));

        Collections.sort(output,(i1,i2)->i1.start-i2.start);

        return output;
    }
}
