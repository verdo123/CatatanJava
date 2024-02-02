package Main.modifier;
/*
IntelliJ IDEA 2023.3.2 (Ultimate Edition)
Build #IU-233.13135.103, built on December 20, 2023
@Author User a.k.a. Benidiktus Verdo
Java Developer
Created on 30/01/2024 20:18
@Last Modified 30/01/2024 20:18
Version 1.0
*/

public class contoh{
    public static void main(String[] args) {

        Menu menu = new Menu("Divisi", "Untuk Setting Divisi");
//        Menu menu1 ;
//        Menu menu2 = new Menu("Hue");

        System.out.println(menu);
        System.out.println(menu.getNamaMenu());
        System.out.println(menu.getDeskripsi());
//        menu.setNamaMenu("Informasi");
//        menu.setDeskripsi("Untuk memberikan informasi");
//        System.out.println(menu);
//        System.out.println(menu.getNamaMenu());
//        System.out.println(menu.getDeskripsi());

    }
}
