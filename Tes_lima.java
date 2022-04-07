/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes_lima;

/**
 *
 * @author rizwa
 */
public class Tes_lima {

public static int nilaiMaks(int[] a, int total){  
    int temp;  
    for (int i = 0; i < total; i++)   
            {  
                for (int j = i + 1; j < total; j++)   
                {  
                    if (a[i] > a[j])   
                    {  
                        temp = a[i];  
                        a[i] = a[j];  
                        a[j] = temp;  
                    }  
                }  
            }  
           return a[total-1];  
    }  

public static void main(String args[]){  
    int a[]={4,6,100,3,5};  
    System.out.println(nilaiMaks(a,5));  
    }
}  

