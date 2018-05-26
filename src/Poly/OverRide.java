/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poly;

/**
 *
 * @author web-bhumi
 */
class Parent
{
    void showMe()
    {
        System.out.println("Poly.Parent.showMe()");
    }
    void willIRun()
    {
        System.out.println("Poly.Parent.willIRun()");
    }
}
class Child extends Parent
{
    void showMe()
    {
        System.out.println("Poly.Child.showMe()");
    }
    void showMeToo()
    {
        System.out.println("Poly.Child.showMeToo()");
    }
    
}


public class OverRide {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.showMe();
        Child c = new Child();
        c.showMe();
        c.showMeToo();
        Parent pc= new Child();
        pc.showMe();
        pc.willIRun();
        
    }
}
