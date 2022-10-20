package AdvancedDSA.LinkedList.LRUCache;

public class UseLRUCache {
    public static void main(String[] args)
    {
        /* 
        LRUCache cache = new LRUCache(2);

        cache.set(1,10);
        cache.set(5,12);
        System.out.println("Get Value of Key 5 : " + cache.get(5));
        System.out.println("Get Value of Key 1 : " + cache.get(1));
        System.out.println("Get Value of Key 10 : " + cache.get(10));
        cache.set(6,14);
        System.out.println("Get Value of Key 5 : " + cache.get(5));
        System.out.println("Get Value of Key 6 : " + cache.get(6));
        System.out.println("Get Value of Key 1 : " + cache.get(1));
        */

        //6 1 S 2 1 S 2 2 G 2 S 1 1 S 4 1 G 2
        /*LRUCache cache = new LRUCache(1);

        cache.set(2,1);
        cache.set(2,2);
        System.out.println("Get Value of Key 2 : " + cache.get(2));
        cache.set(1,1);
        cache.set(4,1);
        System.out.println("Get Value of Key 2 : " + cache.get(2));*/

        //32 4 
        //S 5 13 //S 9 6 //S 4 1 
        //G 4 //S 6 1 //S 8 11 
        //G 13 
        //G 1 //S 12 12 
        //G 10 //S 15 13 //S 2 13 //S 7 5 //S 10 3 
        //G 6 //G 10 //S 15 14 //S 5 12 
        //G 5 //G 7 //G 15 //G 5 //G 6 //G 10 //S 7 13 //G 14 //S 8 9 //G 4 //S 6 11 //G 9 //S 6 12 //G 3

        //1 -1 -1 -1 -1 3 12 5 14 12 -1 3 -1 -1 -1 -1 
        //1 -1 -1 -1 1 3 12 5 14 12 1 3 -1 -1 -1 -1 

        LRUCache cache = new LRUCache(4);

        cache.set(5,13);//1//0
        cache.set(9,6);//2//1//0
        cache.set(4,1);//3//2//1//0
        System.out.println("Get Value of Key 4 : " + cache.get(4));
        cache.set(6,1);//4//3//2//1
        cache.set(8,11);//4//3//2
        System.out.println("Get Value of Key 13 : " + cache.get(13));
        System.out.println("Get Value of Key 1 : " + cache.get(1));
        cache.set(12,12);//4//3
        System.out.println("Get Value of Key 10 : " + cache.get(10));
        cache.set(15,13);//4
        cache.set(2,13);//4
        cache.set(7,5);
        cache.set(10,3);
        System.out.println("Get Value of Key 6 : " + cache.get(6));
    }
}
