package Main.dynamicz;
/*
IntelliJ IDEA 2023.3.2 (Ultimate Edition)
Build #IU-233.13135.103, built on December 20, 2023
@Author User a.k.a. Benidiktus Verdo
Java Developer
Created on 31/01/2024 21:01
@Last Modified 31/01/2024 21:01
Version 1.0
*/

//import org.apache.poi.ss.formula.functions.T;

public interface IService<K> {

    public void inserData(K k);
    public void updateData(K k);
    public void deleteData(K k);
    public void searchData(K k);
}
