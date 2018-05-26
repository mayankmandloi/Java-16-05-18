/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReturnType;

import java.io.IOException;

/**
 *
 * @author web-bhumi
 */
class Test
{
    Test get()
    {
        return  this;
    }
    Exception ee()
    {
        return  new IOException();
    }
}
class West extends Test
{
    @Override
    West get()
    {
        return this;
    }
    @Override
    ArithmeticException ee()
    {
        return new ArithmeticException("Ha");
            
    }
}
public class NewClass {
    
    public static void main(String[] args) {
        
        Test t1 = new Test();
        System.out.println(t1);
        Test t2 = t1.get();
        System.out.println(t2);
        West w = new West();
        System.out.println(w.get());
        Test t3 = w.get();
        
    }
}
