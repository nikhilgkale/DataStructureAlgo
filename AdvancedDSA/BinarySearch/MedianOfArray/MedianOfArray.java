package AdvancedDSA.BinarySearch.MedianOfArray;

import java.util.List;

public class MedianOfArray {
    // DO NOT MODIFY BOTH THE LISTS
	public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        int n = a.size();
        int m = b.size();

        if(n>m){
            return findMedianSortedArrays(b,a);     
        }

        int l = 0; int r = n;//smaller length

        while(l<=r){
            int cut1 = l+(r-l)/2;
            int cut2 = (n+m+1)/2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : a.get(cut1-1);
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : b.get(cut2-1);

            int right1 = (cut1 == n) ? Integer.MAX_VALUE : a.get(cut1);
            int right2 = (cut2 == m) ? Integer.MAX_VALUE : b.get(cut2);

            if(left1 <= right2 && left2 <= right1)
            {
                if((n+m)%2 == 0)
                    return (Math.max(left1, left2) + Math.min(right1, right2)) /2.0 ;
                else
                    return (Math.max(left1, left2));
            }
            if(left1 > right2)
            {
                r = cut1 - 1;
            }
            if(left2 > right1)
            {
                l = cut1 + 1;
            }
        }

        return 0.0;
	}
}
