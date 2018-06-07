/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author web-bhumi
 */
public class Vect {
    public static void main(String[] args) throws IOException {
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);
        String inp="xyz";
        while(!inp.equals("quit"))
        {
            System.out.println("Enter name to Add or quit to quit or view to view all");
            inp=sc.next();
            if(inp.equals("view"))
            {
                Iterator it = v.iterator();
                while(it.hasNext())
                    System.out.println(it.next());
            }
            else if(!inp.equals("quit"))
            v.add(inp);
            
        }
        
    }
}
