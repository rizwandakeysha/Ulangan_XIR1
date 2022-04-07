/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes;

import java.util.Scanner;

/**
 *
 * @author rizwa
 */
public class Tes {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)
   {
      int a, b, terbesar;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Angka Pertama   : ");
      a = scan.nextInt();
      System.out.print("Angka Kedua     : ");
      b = scan.nextInt();
      
      if(a>b)
         terbesar = a;
      else
         terbesar = b;
      
      System.out.println("\nAngka Terbesar  : " +terbesar);
   }
}
