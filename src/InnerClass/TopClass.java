/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;

/**
 *
 * @author web-bhumi
 */
public class TopClass {
   static private class someClass extends TopClass
        {
            someClass()
            {
                System.out.println("I am a Object creater");
            }
        }
    public static void main(String[] args) {
        someClass sc = new someClass();
        System.out.println(sc.getClass().getSuperclass());
    }
}
