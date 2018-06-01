/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author web-bhumi
 */
public class NewClass {
    public static void main(String[] args) {
        FileOutputStream fos;
        byte b[] ={(byte)605,(byte)606,(byte)607,(byte)608};
        try {
            fos = new FileOutputStream("test.t");
            fos.write(257);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
       
        
    }
}
