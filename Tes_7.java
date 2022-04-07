/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes_7;

/**
 *
 * @author rizwa
 */
public class Tes_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array = new int [] {1,7,3,4,9,4,3,3};
        
        System.out.print("Angka yang sama: ");
        
        for(int i = 0; i < array.length; i++) {  
            for(int j = i + 1; j < array.length; j++) {  
                if(array[i] == array[j])  
                    System.out.println(array[j]);  
            }  
        }  
    }  
}          

