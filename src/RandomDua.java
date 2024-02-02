package Main;
/*
IntelliJ IDEA 2023.3.2 (Ultimate Edition)
Build #IU-233.13135.103, built on December 20, 2023
@Author User a.k.a. Benidiktus Verdo
Java Developer
Created on 29/01/2024 21:19
@Last Modified 29/01/2024 21:19
Version 1.0
*/

import java.util.Random;

public class RandomDua {

        public static void main(String[] args) {
            Random random = new Random();
//        for(int i=0;i<10;i++){
//            System.out.println(random.nextInt(5,10));
//        }

            int intLengthName = 0;//untuk tampung panjang nama
            String strVokal = "aiueo";//-> rand.nextInt(1,6)
            String strKonsonan = "bcdfghjklmnpqrstvwxyz";//->rand.nextInt(1,22)
            String strNama = "";
            String [] strProviderEmail = {"gmail","ymail","rocketmail","yahoo"};//rand.nextInt(0,4)
            String [] strDomain = {"com","co.id","id","us","edu"};//rand.nextInt(0,5)
            //[a-z]->(16)@[strProviderEmail].[strDomain]

//        String [] strProviderTelp = {"812","899","823","877"};//
            //random sisa nomor 6 s.d 10
            //for 6x
            // random.next(1,10)
            // random.nextInt(100000,1000000000);
            //dona
            for(int i=0;i<10;i++)//looping untuk banyak nya data
            {//yudi182
                strNama = "";
                intLengthName = random.nextInt(3,11);
                for(int j=0;j<intLengthName;j++)
                {
                    if(j%2!=0)
                    {
                        int vokalRan = random.nextInt(1,6);// yang keluar 1 s.d 5
                        strNama = strNama + strVokal.charAt(vokalRan-1);
                    }else {
                        int konsRan = random.nextInt(1,22);
                        strNama = strNama + strKonsonan.charAt(konsRan-1);
                    }
                }

                strNama = strNama + random.nextInt(1,1001);
                strNama = strNama + "@";
                strNama = strNama + strProviderEmail[random.nextInt(1,5)-1] + ".";
                strNama = strNama + strDomain[random.nextInt(1,6)-1];
                System.out.println(strNama);
            }

//        System.out.println(Math.floor(4.9999999999999999));
//        String nameOne = "DoYo";
//        String nameTwo = "DoYotyuterw";
//        System.out.println(nameOne.compareTo(nameTwo));//110-89
        }

}
