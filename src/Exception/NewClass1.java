/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.io.IOException;

/**
 *
 * @author web-bhumi
 */
public class NewClass1 {
    void test() throws IOException
    {
        throw  new IOException("Hahahaha");
    }
            
    public static void main(String[] args) {
        NewClass1 nc1= new NewClass1();
        try
        {
            System.out.println("1");
            nc1.test();
            System.out.println("2");
        }
        catch (IOException ioe)
                {
                    System.out.println(ioe); 
                }
    }
}
