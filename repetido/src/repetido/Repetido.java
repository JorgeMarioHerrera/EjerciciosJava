/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetido;

/**
 *
 * @author mario El numero que mas se repite dentro de un arreglo
 */
public class Repetido {

    static int[] arreglo = {1, 2, 2, 2, 2,2,2, 4, 5, 6, 7, 8, 8, 8};

    public static void main(String[] args) {
        Object[] number = new Object[2];
        Object[] conteo = new Object[2];

        //Number
        number[0] = arreglo[0];
        //Repetition
        number[1] = 0;

        //Number
        conteo[0] = arreglo[0];
        //Repetition
        conteo[1] = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == (int) number[0]) {
                number[1] = (int) number[1] + 1;                
            } else {
                if ((int) conteo[1] < (int) number[1]) {
                    conteo = guardado(number);
                }
                number[0] = arreglo[i];
                number[1] = 1;
            }
        }

        if ((int) conteo[1] < (int) number[1]) {
            System.out.println("Longest: " + number[1]);
            System.out.println("Number: " + number[0]);
        } else {
            System.out.println("Longest: " + conteo[1]);
            System.out.println("Number: " + conteo[0]);
        }
    }

    static Object[] guardado(final Object[] number) {
        Object[] conteo = new Object[2];
        conteo[0] = number[0];
        conteo[1] = number[1];
        return conteo;
    }
}