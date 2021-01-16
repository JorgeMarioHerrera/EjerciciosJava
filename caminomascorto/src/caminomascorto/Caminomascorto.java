/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caminomascorto;

/**
 *
 * @author mario Encontrar el camino mas corto
 */
public class Caminomascorto {

    static int[] arreglo = {1, 2, 9, 2, 5, 3, 5, 1, 5};
    static int n = 2;

    public static void main(String[] args) {
        caminoMasCorto(2);
    }

    static void caminoMasCorto(final int posInicial) {
        if ((posInicial % n) == 0) {
            Object[] res = calcularcaminoCorto(posInicial);
            System.out.println(res[1]);
        } else {
            System.out.println("Posición inválida.");
        }
    }

    static Object[] calcularcaminoCorto(final int posActual) {
        Object[] res = new Object[2];
        if ((posActual % n) == n - 1) {
            res[0] = arreglo[posActual];
            res[1] = String.valueOf(arreglo[posActual]);
        } else {
            if (sigPosFila(posActual, -1) < 0) {
                Object[] mismoCam = sumarSalto(posActual, calcularcaminoCorto(sigPosFila(posActual, 0)));
                Object[] camAbajo = sumarSalto(posActual, calcularcaminoCorto(sigPosFila(posActual, 1)));
                res = calcMin(camAbajo, mismoCam);
            } else if (sigPosFila(posActual, 1) >= arreglo.length) {
                Object[] mismoCam = sumarSalto(posActual, calcularcaminoCorto(sigPosFila(posActual, 0)));
                Object[] camArriba = sumarSalto(posActual, calcularcaminoCorto(sigPosFila(posActual, -1)));
                res = calcMin(camArriba, mismoCam);
            } else {
                Object[] camArriba = sumarSalto(posActual, calcularcaminoCorto(sigPosFila(posActual, -1)));
                Object[] mismoCam = sumarSalto(posActual, calcularcaminoCorto(sigPosFila(posActual, 0)));
                Object[] camAbajo = sumarSalto(posActual, calcularcaminoCorto(sigPosFila(posActual, 1)));
                res = calcMin(calcMin(camArriba, mismoCam), camAbajo);
            }
        }
        return res;
    }

    static int sigPosFila(final int posActual, final int row) {
        return posActual + 1 + (row * n);
    }

    static Object[] sumarSalto(final int posActual, final Object[] way) {
        Object[] res = new Object[2];
        res[0] = (int) arreglo[posActual] + (int) way[0];
        res[1] = String.valueOf(arreglo[posActual]) + "," + (String) way[1];
        return res;
    }

    static Object[] calcMin(final Object[] cam1, final Object[] cam2) {
        if ((int) cam1[0] >= (int) cam2[0]) {
            return cam2;
        } else {
            return cam1;
        }
    }
}
