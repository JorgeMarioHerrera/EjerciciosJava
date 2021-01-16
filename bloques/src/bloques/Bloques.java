/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mario El de hacer bloques y ordenar los numeros
 */
public class Bloques {

    static Integer arreglo[] = {0, 8, 4, 9, 2, 7, 1, 0, 5, 6, 7, 3};
    static int n = 12;

    public static void main(String[] args) {
        ordenar();
    }

    static void ordenar() {
        List<Integer> bloque = new ArrayList<>();
        String res = "";

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == 0 || i == arreglo.length - 1) {
                if (i == arreglo.length - 1) {
                    bloque.add(arreglo[i]);
                    res = res.concat(sortBlock(bloque));
                } else {
                    res = res.concat(sortBlock(bloque) + " ");
                }
                bloque.clear();
            } else {
                bloque.add(arreglo[i]);
            }
        }
        System.out.println(res);
    }

    static String sortBlock(final List<Integer> bloque) {
        if (bloque.isEmpty()) {
            return "X";
        } else {
            Collections.sort(bloque);
            String res = "";
            for (Integer number : bloque) {
                res = res.concat(String.valueOf(number));
            }
            return res;
        }
    }
}
