/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem01;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 *
 * @author joshu
 */
public class P1 {
    
    
    public static void main (String[] args){
        LinkedHashSet<String> set1 = new LinkedHashSet<String>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        LinkedHashSet<String> set2 = new LinkedHashSet<String>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
        
        //Union
        LinkedHashSet<String> union = new LinkedHashSet<String>(set1);
        union.addAll(set2);
        System.out.println("Union of these two sets is: "+union);
        
        //Difference
        LinkedHashSet<String> difference = new LinkedHashSet<String>(set1);
        difference.removeAll(set2);
        System.out.println("The difference of these two sets is: "+difference);
        
        //Intersection
        LinkedHashSet<String> intersection = new LinkedHashSet<String>(set1);
        intersection.retainAll(set2);
        System.out.println("The intersection of these two sets is: "+intersection);
        
        
    }
}
