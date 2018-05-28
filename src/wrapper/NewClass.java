/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;

/**
 *
 * @author web-bhumi
 */
public class NewClass {
    public static void main(String[] args) {
        int i = 12;
        Integer j = i;//auto boxing
        Integer k = Integer.valueOf(i);
        String s = "23";
        Integer l = Integer.valueOf(s);
        System.out.println(i+" "+j+" "+k+" "+s+" "+l);
        System.out.println(i+j+s+l);
        System.out.println(j.getClass());
        int a= j;//auto unboxing
        


                
    }
}
