package Main.modifier;
/*
IntelliJ IDEA 2023.3.2 (Ultimate Edition)
Build #IU-233.13135.103, built on December 20, 2023
@Author User a.k.a. Benidiktus Verdo
Java Developer
Created on 30/01/2024 20:20
@Last Modified 30/01/2024 20:20
Version 1.0
*/

public class Menu {

    private String namaMenu;
    private String deskripsi;

    public Menu(String namaMenu, String deskripsi) {
        this.namaMenu = namaMenu;
        this.deskripsi = deskripsi;
    }



    public String getNamaMenu() {
        return namaMenu;
    }


    public String getDeskripsi() {
        return deskripsi;
    }


    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}

