package Main;
/*
IntelliJ IDEA 2023.3.2 (Ultimate Edition)
Build #IU-233.13135.103, built on December 20, 2023
@Author User a.k.a. Benidiktus Verdo
Java Developer
Created on 24/01/2024 20:58
@Last Modified 24/01/2024 20:58
Version 1.0
*/

public class string {
    public static void main(String[] args) {
//        int intX = 0;
//        String strX = "Ini String";
//        System.out.println(intX);
//        System.out.println(strX.substring(0,5));


        String firstString = "XYZ";
        String secondString = "RWX";

        System.out.println(firstString.concat(secondString));
        System.out.println(secondString+firstString);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.
                append(firstString).
                append(secondString).toString());

        int intX = 88;
        int intY = 70;
        String strB = "testing";
        System.out.println(intX+intY+strB);
//        operator di atas akan menghasilkan append (penjumlahan int digabungkan dengan string)
        System.out.println(strB.length());
//        operator di atas akan menghitung banyaknya karakter string di atas
        String strSplit  = "ABC#DEF#HIJ";
        String strArr [] = strSplit.split("#");
        System.out.println(strArr[2]);
//        operator di atas akan memberikan str pada array ke 2 setelah split (# adalah split)

    }
}
