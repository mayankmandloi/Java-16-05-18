/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringExample;

/**
 *
 * @author web-bhumi
 */
public class NewClass1 {
    public static void main(String[] args) {
        String s1= "Aniket";
        String s2="Aniket";
        //s2="Mr."+s2;
        String s3 = new String("Aniket");
        String s4 = new String("Aniket");

        if (s1.equals(s2)) {
            System.out.println("We are equal ");
        }
        else
        {
            System.out.println("We are diffrent");
        }
    }
}
