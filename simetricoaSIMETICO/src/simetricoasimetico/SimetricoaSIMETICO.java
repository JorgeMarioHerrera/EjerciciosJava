/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simetricoasimetico;

/**
 *
 * @author mario Mira si el arreglo es simétrico o asimétrico,
 */
public class SimetricoaSIMETICO {

    static String[] arreglo = {"oso", "cara", "pez", "ola", "ola", "pez", "cara", "oso", "ey"};
    static int n = arreglo.length;

    public static void main(String[] args) {

        boolean andera = true;
        int lastPosition = n - 1;
        for (int i = 0; i < arreglo.length; i++) {
            if (!arreglo[i].equals(arreglo[lastPosition])) {
                andera = false;
                break;
            }
            lastPosition--;
        }

        if (andera) {
            System.out.println("Simetrico");
        } else {
            System.out.println("Asimetrico");
        }
    }

}
