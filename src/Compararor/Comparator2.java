package Compararor;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator2
{
    public static void main(String[] args)
    {
        int[][] intervals = { {2,0}, {1,0}, {3,2}, {4,1}, {8,2}, {5,2} };

        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] p1, int[] p2)
            {
                if(p1[1] == p2[1]) return p1[0] - p2[0]; //if 2nd ele is same sort on 1st ele basis.
                else return p1[1] - p2[1];               // else sort on 2nd ele basis.
            }
        });

        //OR we can use lambda
       //Arrays.sort(intervals,(a,b)->{
       //    if(a[1] == b[1]) return a[0] -b[0];
       //    return a[1] - b[1];
       //});

        for(int i=0; i<6; i++) System.out.println(intervals[i][0]+ " " + intervals[i][1]);
    }
}
