/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticAndInstance;
abstract class Test
{
    void showMe()
    {
        System.out.println("staticAndInstance.Test.showMe()");
    }
    abstract void iAmGroot();
}
/**
 *
 * @author web-bhumi
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Test t = new Test(){
    void iAmGroot(){}
    };
    t.iAmGroot();
    }
}
