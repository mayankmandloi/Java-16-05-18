/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 *
 * @author web-bhumi
 */
public class NewClass4 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Haha");
        String input=br.readLine();
        System.out.println(input);
//        ------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("hahaha");
        input=sc.next();
        System.out.println(input);
        
    }
}
