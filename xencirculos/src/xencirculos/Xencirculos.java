/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xencirculos;

/**
 *
 * @author mario El de mover una X en unos circulos
 */
public class Xencirculos {

    static int[] arreglo = {1, 2, -1, 1, 0, 1, 2, -1, -1, -2};
    static int n = 4;
    static int[] positionX = {0, 0};

    public static void main(String[] args) {

        for (int i = 2; i < arreglo.length + 2; i = i + 2) {
            positionX = verticalMove(horizontalMove(positionX, arreglo[i - 2]), arreglo[i - 1]);
        }

        for (int i = 0; i < 4; i++) {
            String row = "";
            for (int j = 0; j < 4; j++) {
                if (i == positionX[0] && j == positionX[1]) {
                    row = row + "X";
                } else {
                    row = row + "0";
                }
            }
            System.out.println(row);
        }
    }

    private static int[] horizontalMove(int[] positionX, int horizontalMove) {
        int move = positionX[1] + horizontalMove;

        if (move < 0) {
            positionX[1] = 0;
        } else if (move > n - 1) {
            positionX[1] = n - 1;
        } else {
            positionX[1] = move;
        }
        return positionX;
    }

    private static int[] verticalMove(int[] positionX, int verticalMove) {
        int move = positionX[0] + verticalMove;

        if (move < 0) {
            positionX[0] = 0;
        } else if (move > n - 1) {
            positionX[0] = n - 1;
        } else {
            positionX[0] = move;
        }
        return positionX;
    }

}
