/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author web-bhumi
 */
public class Oper {
// uniery ++ -- ~ !
// binary:- 
// Arithmatic:-+,-,*,/,% 
// Relational<,>,<=,>=,==,!= 
// Logical &&,||,!
// bitwise & |
// Assignment = += -= *= /= %=
// ternery  (condition)?val1:val2
public static void main(String[] args) {
            int a= 100+20*10+300/10;
            //System.out.println(a);
            float f = 12.06f;
            double d = 12.06;
            System.out.println(f>d);
            if(t1()&&t2()&&t3())
            {
                System.out.println("lets see");
            }  
            int b=12;
            b+=8;//b=b+8
            System.out.println(b);
            b-=10;
            System.out.println(b);
            int e = (a>b)?12:45;
            System.out.println(e);
            int k=0;
            System.out.println(k++);
            System.out.println(++k);
            int l=0;
            int m = ++l + ++l;
            System.out.println(l+" "+m);
    }

static boolean t1()
{
    System.out.println("I am t1");
    return false;
}
static boolean t2()
{
    System.out.println("I am t2");
    return false;
}
static boolean t3()
{
    System.out.println("I am t3");
    return false;
}
    
}
