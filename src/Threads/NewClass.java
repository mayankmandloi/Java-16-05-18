/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author web-bhumi
 */
class NumberPrinter extends  Thread
{
    public  void run()
    {
        System.out.println("Hello");
    }
}
public class NewClass {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        np.start();
    }
}
