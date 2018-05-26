/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticAndInstance;

/**
 *
 * @author web-bhumi
 */
public class StaticAndInstance {
    int a,b,c,d;
    static int e,f,g,h;
    void counter()
    {
/* we can use static vaiables inside not static method
    as well as not static variables but static variables
    will be shared across all the object and  instance
    (non-static)vaiables have a copy for each object
*/
        a++;
        b++;
        e++;
        f++;
        System.out.println(" a:-"+a+" b:-"+b+" e:-"+e+"f:-"+f);
    }
    StaticAndInstance()
    {
        c++;
        g++;
    }
    void showCG()
    {
        System.out.println("C:-"+c+" g:- "+g);
    }
    static void dummy()
    {
        
    }
    public static void main(String[] args) {
/*  All the static variables which are defind
    inside class can be accessible here, as main 
method itself is static but we can not access instance 
or non static vaiables without creating a object of the 
StaticAndInstance class;
*/
dummy();
StaticAndInstance s1 = new StaticAndInstance();
//s1.showCG();// 1 1

StaticAndInstance s2 = new StaticAndInstance();
//s2.showCG();// 1 2
//s1.showCG();// 1 2

s1.counter();// 1 1 1 1
s1.counter();// 2 2 2 2
s2.counter();// 1 1 3 3
s2.counter();// 2 2 4 4




    }
}
