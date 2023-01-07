package Compararor;

import java.util.*;
class Comp implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
public class Comparator1
{
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(11);
        arr.add(7);
        arr.add(16);
        arr.add(5);

        System.out.println(arr);

        //METHOD 1
       //Collections.sort(arr, new Comparator<Integer>() {
       //    @Override
       //    public int compare(Integer o1, Integer o2) {
       //        return o2 - o1;
       //    }
       //});

        //METHOD 2
        //Collections.sort(arr, new Comp());

        //METHOD 3 -> lambda
        Collections.sort(arr, (a,b)->{
            return b-a ;
        });

        //METHOD 4  FOR SORTING IN DEC ORDER
        //Collections.sort(arr,Collections.reverseOrder());

        System.out.println(arr);
    }
}
