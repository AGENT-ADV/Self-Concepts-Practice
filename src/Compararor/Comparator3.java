package Compararor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Boy implements Comparable<Boy>
{
    String name;
    int ht;
    int wt;

    Boy(String name, int ht, int wt) {
        this.name = name;
        this.ht = ht;
        this.wt = wt;
    }

    @Override
    public int compareTo(Boy o) { //treat "o" as "o2" and "this" as "o1".
        if(this.ht == o.ht) return this.wt - o.wt;
        return this.ht - o.ht;
    }
}

class HeightComparator implements Comparator<Boy>
{
    @Override
    public int compare(Boy o1, Boy o2) {
        //if(o1.ht == o2.ht) return o1.wt - o2.wt;
        return o1.ht - o2.ht;
    }
}
class WeightComparator implements Comparator<Boy>
{
    @Override
    public int compare(Boy o1, Boy o2) {
        if(o1.wt == o2.wt) return o2.ht - o1.ht;
        return o1.wt - o2.wt;
    }
}
public class Comparator3
{
    public static void main(String[] args)
    {
        List<Boy> arr = new ArrayList<>();
        arr.add(new Boy("ram",5,60));
        arr.add(new Boy("shyam",6,80));
        arr.add(new Boy("sohan",6,60));

        //METHOD 1
       //Collections.sort(arr, new Comparator<Boy>() {
       //    @Override
       //    public int compare(Boy o1, Boy o2) {
       //        if(o1.ht == o2.ht) return o1.wt - o2.wt;
       //        return o1.ht - o2.ht;
       //    }
       //});

        //METHOD 2
        //Collections.sort(arr, new HeightComparator());
        //Collections.sort(arr,new WeightComparator());

        //METHOD 3
        //Collections.sort(arr,(o1,o2)->{
        //    if(o1.wt == o2.wt) return o2.ht - o1.ht;
        //    return o1.wt - o2.wt;
        //});


        //METHOD 4 -> using comparable fn which is implemented in class.
        Collections.sort(arr);

        for(Boy b :arr) System.out.println(b.name);

    }
}
