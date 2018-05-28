package Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Day3;

/**
 *
 * @author boss 123
 */
public class Array4 {
    
    public static void main(String args[]){
        
        int a[][]=new int[][]{{3,4,2},{4,6},{6,7,4,2,1},{5,6,4,2}};
        
        for(int x[]:a){
            for(int y:x){
                System.out.print(" "+y);
            }
            System.out.println();
        }
        
        
    }
    
}
