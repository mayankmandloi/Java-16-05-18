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
public class Xyz{
    public Xyz(int i)
    {
        System.out.println("I am a Object Maker "+i);
    }
    public static void main(String[] args) {
        Xyz x = new Xyz(23);
    }
    
}
class Abc extends Xyz
{
    public Abc(int j)
    {
        super(j);
       
    }
    public static void main(String[] args) {
        Abc a = new Abc(12);
    }
}
