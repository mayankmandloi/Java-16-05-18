/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author web-bhumi
 */
class NumberPrinter1 extends  Thread
{
    int timeztoSleep;
    int j;
    public NumberPrinter1(int timeztoSleep)
    {
        this.timeztoSleep =timeztoSleep;
    }
    
    public  void run()
    {
        for(j=0;j<10;j++)
        {
            try {
                Thread.sleep(this.timeztoSleep);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        System.out.println(this+" Hello "+j);
        }
    }
}
public class NewClass1 {
    public static void main(String[] args) {
        NumberPrinter1 np = new NumberPrinter1(800);
        NumberPrinter1 np1 = new NumberPrinter1(899);
        np.start();
        np1.start();
    }
}
