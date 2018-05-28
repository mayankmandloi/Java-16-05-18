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
public class ArrayTest6 {
      public static void main(String[] args) {
        int [][] array2d =new int[][]{{3,5,4,3},{1,2,3},{2,6,5,4},{2,6,9,0,}};
        for(int i[]:array2d)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
      }
        
    
}