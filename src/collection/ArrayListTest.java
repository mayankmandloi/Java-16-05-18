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
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Mayank");
        al.add(new IOException("Test"));
        al.add(45);
        Iterator ir= al.iterator();
        while(ir.hasNext())
        {
            System.out.println("Ans:- "+ir.next());
        }
        for(Object ob:al)
        {
            System.out.println(ob);
        }
        
        
    }
            
}
