/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes_tiga;

import java.util.Scanner;

/**
 *
 * @author rizwa
 */
public class Tes_tiga {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int i = 1, jum = 0;
       int n;
       System.out.print("Angka Batas : ");
       n = input.nextInt();
       while (i <= n) {
           jum = jum + i;
           System.out.print(i + " " + "+" + " ");
           i++;
       }
       System.out.print("="+ " " + jum);
    }
}
