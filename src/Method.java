package Main;
/*
IntelliJ IDEA 2023.3.2 (Ultimate Edition)
Build #IU-233.13135.103, built on December 20, 2023
@Author User a.k.a. Benidiktus Verdo
Java Developer
Created on 29/01/2024 20:22
@Last Modified 29/01/2024 20:22
Version 1.0
*/


import java.sql.SQLException;

    public class Method {

        public static void main(String[] args) {
            String strX = getStrOne("Satu")+getStrTwo("Dua");
            getStrVoid("Tiga");
            System.out.println(strX);
        }

        public static String getStrOne(String strA) {
            return "Ini adalah statement dari STRA "+strA;
        }

        public static String getStrTwo(String strB){
            getStrVoid("Empat");
            return "\nIni adalah statement dari STRB "+strB;
        }

        public static void getStrVoid(String strC){
            System.out.println("\nIni adalah statement dari STRC "+strC);
        }

    }

