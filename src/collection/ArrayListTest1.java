/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author web-bhumi
 */



class Student1 implements Comparable<Student1>
{
    int s1,s2,s3,s4,s5;
    String name;
    Student1(String name,int s1,int s2,int s3,int s4,int s5)
    {
        this.name=name;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;
        this.s5=s5;
    }

    float avg(Student1 o)
    {
        return (o.s1+o.s2+o.s3+o.s4+o.s5)/5;
    }
    @Override
    public int compareTo(Student1 o) {
        if(avg(this)==avg(o))
        {
            return 0;
        }
        else if(avg(this)>avg(o))
        {    
            return -1;
        }
        else
        {
            return 1;
        }
    }
    
}
public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<Student1> al = new ArrayList<Student1>();
        Student1 s1= new Student1("Aniket0", 3, 30, 20, 10, 30);
        Student1 s2= new Student1("Aniket1", 20, 30, 10, 10, 10);
        Student1 s3= new Student1("Aniket2", 21, 34, 17, 12, 40);
        Student1 s4= new Student1("Aniket3", 2, 30, 33, 23, 15);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        
        Collections.sort(al);
        
        Iterator ir= al.iterator();
        while(ir.hasNext())
        {
            System.out.println("Ans:- "+ir.next());
        }
        for(Student1 ob:al)
        {
            System.out.println(ob.name+" "+s1.avg(ob));
        }
        
        
    }
            
}
