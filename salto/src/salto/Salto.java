/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salto;

/**
 *
 * @author mario Esta es la que le salio a Jhon Frddy de decir si gana o no el
 * salto
 */
public class Salto {

    static int limite = 2;
    static int[] arreglo = {1, 1, 1, 1, 0, 99};

    public static void main(String[] args) {

        boolean bandera = true;
        int countHoles = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == 0 || arreglo[i] == 99) {
                countHoles = 0;
            } else {
                countHoles++;
            }

            if (limite <= countHoles) {
                bandera = false;
                break;
            }
        }

        if (bandera) {
            System.out.println("has ganado");
        } else {
            System.out.println("has perdido");
        }
    }

}
