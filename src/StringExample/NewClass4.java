/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringExample;

import java.util.StringTokenizer;

/**
 *
 * @author web-bhumi
 */
public class NewClass4 {
    public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("my name is khan","n");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.countTokens()+"Tokan:- "+st.nextToken());  
     }  
   }  
}
