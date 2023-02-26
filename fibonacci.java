/*
     n=10  fib=[0 1 1 2 3 5 8 13 21 34]
 */

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int n = 10;
        int prev=0 , next=1 , count=0;
        ArrayList<Integer> s = new ArrayList<>();
        while(n!=count){
            s.add(prev);
            int sum=prev+next;
            prev=next;
            next=sum;
            count++;
        }
        System.out.println(s);
    }
}
