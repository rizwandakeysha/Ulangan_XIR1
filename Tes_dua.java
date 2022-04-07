/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes_dua;

import java.util.Scanner;

/**
 *
 * @author rizwa
 */
public class Tes_dua {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)
   {
      int a;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Angka   : ");
      a = scan.nextInt();
      
      if(a % 2 == 0)
           System.out.println(a+" adalah bilangan genap");
      else
         System.out.println(a+" adalah bilangan ganjil");
   }
}
