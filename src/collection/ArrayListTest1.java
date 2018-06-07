/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author web-bhumi
 */

class Student1
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
    
}
public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<Student1> al = new ArrayList<Student1>();
        Student1 s1= new Student1("Aniket", 20, 30, 40, 50, 60);
        Student1 s2= new Student1("Aniket", 20, 30, 40, 50, 60);
        al.add(s1);
        al.add(s1);
        al.add(s1);
        al.add(s1);
        al.add(s1);
        
        al.add(s2);
        Iterator ir= al.iterator();
        while(ir.hasNext())
        {
            System.out.println("Ans:- "+ir.next());
        }
        for(Student1 ob:al)
        {
            System.out.println(ob.name);
        }
        
        
    }
            
}
