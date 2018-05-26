/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author web-bhumi
 */
public class NewClass {
    public static void main(String[] args) {
        int a = 12;
        try
        {
        System.out.println(a/0);
        }
        finally
        {
            System.out.println("I am finally not final");
        }
        System.out.println("I am a Normal part of the program which will work anyways");
    }
    
}
