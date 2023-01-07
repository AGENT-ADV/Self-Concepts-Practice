package Compararor;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student implements Comparable<Student>
{
    String name;
    int ht;
    int wt;
    Student(String name,int ht,int wt)
    {
        this.name = name;
        this.ht=ht;
        this.wt=wt;
    }
    @Override
    public int compareTo(Student other)
    {
        if(other.ht == this.ht)  return other.wt-this.wt;
        return this.ht-other.ht;
    }
}

class StudentComparatorHeight implements Comparator<Student>
{
    @Override
    public int compare(Student a,Student b)
    {
        return b.ht-a.ht;
    }
}


class StudentComparatorWeight implements Comparator<Student>
{
    @Override
    public int compare(Student a,Student b)
    {
        return a.wt-b.wt;
    }
}
public class Comparator4
{
    public static void main(String[] args)
    {
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentComparatorHeight());
        PriorityQueue<Student> pq2 = new PriorityQueue<>(new StudentComparatorWeight());
       //PriorityQueue<Student> pq3 = new PriorityQueue<>(new Comparator<Student>() {
       //    public int compare(Student a,Student b)
       //    {
       //        if(a.ht == b.ht) return b.wt-a.wt;
       //        return a.ht-b.ht;
       //    }
       //});

        PriorityQueue<Student> pq3 = new PriorityQueue<>((a,b)->{
            if(a.ht == b.ht) return b.wt-a.wt;
            return a.ht-b.ht;
        });

        pq.add(new Student("Rohan",10,15));
        pq.add(new Student("Rahul",100,78));
        pq.add(new Student("Shivam",1,75));
        //while(!pq.isEmpty()) System.out.println(pq.remove().name);

        pq2.add(new Student("Rohan",10,15));
        pq2.add(new Student("Rahul",100,78));
        pq2.add(new Student("Shivam",1,75));
       // while(!pq2.isEmpty()) System.out.println(pq2.remove().name);

        pq3.add(new Student("Rohan",10,15));
        pq3.add(new Student("Rahul",100,78));
        pq3.add(new Student("Shivam",10,75));
        while(!pq3.isEmpty()) System.out.println(pq3.poll().name);



    }
}
