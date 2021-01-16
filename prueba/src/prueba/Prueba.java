/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.HashMap;

/**
 *
 * @author mario
 */
public class Prueba {
    
    static class alfa {
         public int getThis(int x, int y) { return x+y; }
    };
   static class beta extends alfa {
        public int getThis(int x, int y) {return x-y;}
    }
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        beta b = new beta();
        System.out.println("x = " + b.getThis(0, 2));
        
        
    }
    
}
