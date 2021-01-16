/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxnumber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mario
 */
public class Maxnumber {

    static int arreglo[] = {13, 10000, 1000, 35, 1};

    public static void main(String[] args) {
        System.out.println(max(arreglo));
        
    }
    
    /**
     *
     * @param arregglo
     * @return
     */
    public static int max(int arregglo[]) {
       List<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < arregglo.length; i++) {
            lista.add(arregglo[i]);
        }
        return (Collections.max(lista));
   }
}
