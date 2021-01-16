/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udef;

import java.util.List;

/**
 *
 * @author mario
 */
public class Udef {

    
    static int[] arr = { 1,3,4,2,7,0};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if((arr[i]) == 4) {                   
                    break;
                    
            }
            for (int j = 1; j < arr.length; j++) {
                int y = arr[j];                   
                if((x+y) == 10) {
                    System.out.println(x + " "+ y);
                    break;
                    
            }
            }
            
            
        }
    }
}
