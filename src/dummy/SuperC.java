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
class d
{
    String name="dlab";
    String name1="dlab";

}
class c extends d
{
    String name="clab";
    void test()
    {
        System.out.println(this.name+" "+super.name+" "+name1);
    }
}
public class SuperC {
    public static void main(String[] args) {
        c C = new c();
        C.test();
    }
}
