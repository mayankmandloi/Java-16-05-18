/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;

interface dummy
{
    void showMe();
}


public class NoNameClass {
    class Ha{};
    dummy d = new dummy() {
        public void showMe() {
            System.out.println(".showMe()");
        }
    };
}
