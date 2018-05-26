/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package This;

/**
 *
 * @author web-bhumi
 */
class Test
{
    int a;
    static String s;
    void setAandS0(int a,String s)
    {
        this.a=a;
        this.s=s;
    }
        void setAandS1(int a,String s)
    {
        this.a=a;
        Test.s=s;
    }
} 

public class NewClass {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.setAandS0(12, "Web Bhumi");
        System.out.println(t1.a+" "+t1.s);
        System.out.println(Test.s);
        t1.setAandS0(12, "Web Bhumi");

        System.out.println(t2.a+" "+t2.s);
;
    }
}
