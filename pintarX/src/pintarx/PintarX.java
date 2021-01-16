/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintarx;

/**
 *
 * @author mario Dibujar una X en un tablero n*n
 */
public class PintarX {

  static int n = 8;

    public static void main(String[] args) {

        if(n == 0){
            System.out.println("ERROR");    
        }else{
            paintX();
        }
    }

    static void paintX() {
        for (int i = 0; i < n; i++) {
            String row = "";
            for (int j = 0; j < n; j++) {
                if (getX(i, j)) {
                    row = row + "X";
                } else {
                    row = row + " ";
                }
            }
            System.out.println(row);
        }
    }

    static boolean getX(int i, int j) {

      return i == j || i + j - n == -1;
    }

}