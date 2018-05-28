package Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author boss 123
 */
public class Array2DInput {
    public static void main(String[] args) throws IOException {
        String[] person[]=new String[3][2];
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
       
        for(int i=0;i<person.length;i++)
        {
            for(int j=0;j<person[i].length;j++)
            {
                person[i][j]=br.readLine();
            }
        }
        
for(String a1[]:person)
        {
            for(String name:a1)
            {
                System.out.print(name+" ");
            }
            System.out.print("\n");
        }        
    }
}
