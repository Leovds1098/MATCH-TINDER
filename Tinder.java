/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinder;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Tinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c; 
        int quesitos=0;
        
        System.out.println("Tinder da TI\n\nClassifique os quesitos de 0 a 10");
        
        System.out.println("Qual a nota para Altura? ");
        a= sc.nextInt();
        if (a >= 7){
            quesitos++;
        }
        System.out.println("Qual a nota para Beleza? ");
        b = sc.nextInt();
        if (b >= 7){
            quesitos++;
        }
        
      
        System.out.println("Qual a nota para Carisma? ");    
         c= sc.nextInt();
         if (c >=7){
             quesitos++;
         }
         sc.close();
         
         if (quesitos >= 3){
          System.out.println("\nBoooooooraa!!");
         } else if (quesitos >= 2){
          System.out.println("\nSo vai...");       
         } else if (quesitos >=1){
         System.out.println("\nFé em Deus...");          
         }else {
         System.out.println("\nMisericordia!!");         
         }
        }
    }
    
