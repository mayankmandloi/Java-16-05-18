/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author web-bhumi
 */
public class NewClass1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("test.t");
            int count=fis.available();
            for(int i=0;i<count;i++)
            {
               
                System.out.println(fis.read());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);        
                    }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
        
    }
}
