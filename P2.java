/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;



/**
 *
 * @author joshu
 */
public class P2 {
    
    public static void main (String[] args){
        if(args.length==1){
            String fileName = args[0];
            TreeSet<String> set = new TreeSet<String>();
            File directoryFile = new File(fileName);
            
            try{
                Scanner scan = new Scanner(directoryFile);
                while (scan.hasNext()){
                    set.add(scan.next());
                }
                System.out.println(set);
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("File name must be passed as a command line (cmd) argument. Please try again");
        }
    }
    
}
