/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathdev;

import java.util.Scanner;

/**
 *
 * @author DARMAWANTO
 */
public class Mathdev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int no= 0;
       String nama;
       System.out.println("***************************");
       System.out.println("Game Math");
       System.out.println("***************************");
       System.out.println("Masukan nama anda:  ");
       nama = input.nextLine();
       System.out.println("***************************");
       System.out.println("Game Math");
       System.out.println("***************************");
       System.out.println("Menu :");
       System.out.println("1. pemjumlahan");
       System.out.println("2. pengurangan");
       System.out.println("3. keluar");
       System.out.println("pilih no menu:   ");
       no = input.nextInt();
       System.out.println("***************************");
       switch (no){
           case 1:
               System.out.println("Game math = pemjumlahan");
               System.out.println("***************************");
               System.out.println("berapa hasil dari 3 + 4 ?");
               no = input.nextInt();
               if (no == 7){
                        System.out.println("jawaban benar"+nama);
                    } else if (no < 100){
                        System.out.println("jawaban salah"+nama);
                 }
               System.out.println("berapa hasil dari 5 + 1 ?");
               no = input.nextInt();
               if (no == 6){
                        System.out.println("jawaban benar "+nama);
                    } else if (no < 100){
                        System.out.println("jawaban salah "+nama);
                 }
               System.out.println("berapa hasil dari 2 + 7 ?");
               no = input.nextInt();
               if (no == 9){
                        System.out.println("jawaban benar"+nama);
                    } else if (no < 100){
                        System.out.println("jawaban salah"+nama);
                 }
               break;
           case 2:
               System.out.println("Game math = pengurangan");
               System.out.println("***************************");
               System.out.println("berapa hasil dari 5 - 10 ?");
               no = input.nextInt();
               if (no == 5){
                        System.out.println("jawaban benar"+nama);
                    } else if (no < 100){
                        System.out.println("jawaban salah"+nama);
                 }
               System.out.println("berapa hasil dari 17 - 5 ?");
               no = input.nextInt();
               if (no == 12){
                        System.out.println("jawaban benar "+nama);
                    } else if (no < 100){
                        System.out.println("jawaban salah "+nama);
                 }
               System.out.println("berapa hasil dari 1 - 1 ?");
               no = input.nextInt();
               if (no == 0){
                        System.out.println("jawaban benar"+nama);
                    } else if (no < 100){
                        System.out.println("jawaban salah"+nama);
                 }
               break;
           case 3:
               System.out.println("yaudah");
               break;
           
       }
       
       
       }
       
    }
    

