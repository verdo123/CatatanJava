package Main.collection;
/*
IntelliJ IDEA 2023.3.2 (Ultimate Edition)
Build #IU-233.13135.103, built on December 20, 2023
@Author User a.k.a. Benidiktus Verdo
Java Developer
Created on 01/02/2024 20:13
@Last Modified 01/02/2024 20:13
Version 1.0
*/

public class User {

    private String nama;
    private String alamat;
    private String tglLahir;
    private Object NamaLengkap;
    private String Password;


    public User(String username, String password) {
    }

    public User() {
    }

    public void setPassword(String Password) {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getNamaLengkap() {
        return nama;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.NamaLengkap = namaLengkap;
    }


    public String getPassword() {
        return Password;
    }
}
