/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author web-bhumi
 */
public class NewClass2 {
    public static void main(String[] args) {
        FileWriter fw=null;
        BufferedWriter bw=null;
        try{
        fw = new FileWriter("test.txt");
        bw= new BufferedWriter(fw);
        bw.write("Hello I am Mayank from Web Bhumi");
        bw.write("We are writing some data into test.txt");
        }
        catch (IOException ioe)
        {
            System.out.println(ioe);
        }
        finally
        {
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
            
        }
    }
}
