package Main;
/*
IntelliJ IDEA 2023.3.2 (Ultimate Edition)
Build #IU-233.13135.103, built on December 20, 2023
@Author User a.k.a. Benidiktus Verdo
Java Developer
Created on 29/01/2024 20:54
@Last Modified 29/01/2024 20:54
Version 1.0
*/

import java.util.Scanner;

public class Palindrom {

        //Masam - masaM
        //Kakak - kakaK
        //ABANG - GNABA
        //0->4
        //1->3
        //2->2
        //3->1
        //4->0
        // var x = Masam;
        // var y = masaM;
        // compare x == y ? true -> palindrom , false -> bukan palindrom

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            System.out.print("Masukkan kata palindrom yang ingin diproses : ");
            String strText = scn.nextLine();//Input text palindrom
            System.out.println("Length Inputan -> "+strText.length());
            String poli = "";
            StringBuilder strBuilder = new StringBuilder();
            String strTest ="";

            System.out.println(strText.length());
            //Kakak - kakaK <-- INPUTAN
            strBuilder.setLength(0);//Hapus seluruh isi strBuilder
            for(int i=strText.length();i>0;i--)
            {
                //Kakak -> kakaK
                //abang
                //gnaba
                System.out.println(strText.substring(i-1, i)+" i = "+i);
                strTest = strText.substring(i-1, i);
//			strTest = String.valueOf(strText.charAt(i-1));
			/*
			i = 5, strTest = k , strBuilder = k -> poli = k
			i = 4 , strTest = a , strBuilder = ka -> poli = ka
			i = 3 , strTest = k , strBuilder =  kak -> poli = kak
			i = 2 , strTest = a , strBuilder = kaka -> poli = kaka
			i = 1 , strTest = K , strBuilder = kakaK -> poli = kakaK
			 */
                poli = strBuilder.append(strTest).toString();
            }
            /*
             * 0-K
             * 1-a
             * 2-k
             * 3-a
             * 4-k
             *
             * 1-K
             * 2-a
             * 3-k
             * 4-a
             * 5-k
             */
            //Kakak - kakaK
            //0-1-2-3-4 - 4-3-2-1-0
            //TEST = TEST
            //JERUK = JERUK
            //KAKAK = KAKAK
            strBuilder.setLength(0);//Hapus seluruh isi strBuilder
            if(strText.equalsIgnoreCase(poli)){
                System.out.println("==== "+strText+" adalah Palindrome =====");
            }
            else
            {
                System.out.println("==== "+strText+" bukan Palindrome =====");
            }
        }
    }
