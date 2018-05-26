/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

/**
 *
 * @author web-bhumi
 */
public class LowerHalf {
    public static void main(String[] args) {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<5-i*2;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
   
}
