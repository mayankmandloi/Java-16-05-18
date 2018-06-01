/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.File;

/**
 *
 * @author web-bhumi
 */
public class NewClass3 {
    public static void main(String[] args) {
        File file;
        String s="";
        for(int i=0;i<150;i++)
        {
            s+=i+"/";
        }
        file = new File(s);
        file.mkdirs();
    }
   
}
