/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bottle;

/**
 *
 * @author mario
 */
public class Bottle {

    /**
     * @param args the command line arguments
     */
    
    
    public static int empty(int i) {
        if (i > 0) {
            System.out.println(i);
            return empty(i -1 );            
        } else {
            return i;
        }
    }
    public static void main(String[] args) {
        System.out.println(empty(empty(3)));
    }
    
}
