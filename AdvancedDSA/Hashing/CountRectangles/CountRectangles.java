package AdvancedDSA.Hashing.CountRectangles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CountRectangles {
    
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        A.add(1);A.add(1);A.add(2);A.add(2);A.add(3);A.add(3);
        B.add(1);B.add(2);B.add(1);B.add(2);B.add(1);B.add(2);

        System.out.println(solve(A,B));  
    }

    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Set<Pair>  points = new HashSet<Pair>();
        for(int i = 0;i<A.size();i++) {
            points.add(new Pair(A.get(i), B.get(i)));
        }
        int res = 0;
        for(int i = 0;i<A.size();i++) {
            for(int j = i+1;j<A.size();j++) {
                if( A.get(i).equals(A.get(j) ) || B.get(i).equals(B.get(j))  ){
                    continue;
                }
                if(points.contains(new Pair(A.get(i), B.get(j))) && points.contains( new Pair(A.get(j), B.get(i)) )  )
                        res++;
            }
        }
        return res/2;
    }
}
class Pair{
    int x ;
    int y;
   
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int hashCode() {
        return x*31+y;
    }
    @Override
    public boolean equals(Object obj) {
        Pair ob = (Pair) obj;
        return (ob.x==this.x) && (ob.y ==this.y );
    }
}
