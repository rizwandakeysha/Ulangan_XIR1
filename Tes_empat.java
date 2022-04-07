/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes_empat;

/**
 *
 * @author rizwa
 */
public class Tes_empat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka[] = {6, 2, 8, 1, 16, 20, 33};
        int n = angka.length;
        System.out.print("\n Genap : ");
        for (int i = 0; i < n; i++) {
            if (angka[i] % 2 == 0) {
                System.out.print(angka[i] + ", ");

            }
        }

        System.out.print("\n Ganjil : ");
        for (int j = 0; j < n; j++) {
            if (angka[j] % 2 != 0) {
                System.out.print(angka[j] + ", ");
            }
        }
    }
}
