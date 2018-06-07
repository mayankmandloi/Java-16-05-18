/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author web-bhumi
 */

class T implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
    Integer i1= (Integer)o1;
    Integer i2=(Integer)o2;
    if(i1.intValue()==i2.intValue())
    {
        return 0;
    }
    else if(i1.intValue()>i2.intValue())
    {
        return -1;
    }
    else
    {
        return 1;
    }
    }
    
}

public class NewClass {
    public static void main(String[] args) {
        LinkedList <Integer>ll= new LinkedList<Integer>();
        ll.add(23);        
        ll.add(24);
        ll.add(3);
        ll.add(46);
        ll.add(42);
        ll.add(678);
        ll.add(45);
        System.out.println(Collections.min(ll));
        Collections.sort(ll,new T() );
        Iterator ii = ll.iterator();
        while(ii.hasNext())
        {
            System.out.println(ii.next());
        }
        

    }
}
