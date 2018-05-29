/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valueVsReffrence;

/**
 *
 * @author web-bhumi
 */
public class NewClass {
    static void test(float a,float b)
    {
        System.out.println(a+" "+b);
        float c= a;
        a=b;
        b=c;
        System.out.println(a+" "+b);
    }
    static void test(NewClass a, NewClass b)
    {
        System.out.println(a.first+" "+b.first);
        int c = a.first;
        a.first=b.first;
        b.first=c;
        System.out.println(a.first+" "+b.first);
    }
    int first,second;

    public NewClass(int a,int b) {
        first=a;
        this.second=b;
    }
    public static void main(String[] args) {
//        float e,f;
//        e=12.23f;
//        f=56.67f;
//        System.out.println(e+" "+f);
//        test(e,f);
//        System.out.println(e+" "+f);
        NewClass n1 = new NewClass(12,44);
        NewClass n2 = new NewClass(55,44);
        System.out.println(n1.first+" "+n2.first);
        test(n1, n2);
        System.out.println(n1.first+" "+n2.first);


    }
    
}
