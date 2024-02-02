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

import java.util.ArrayList;

public class ArrayListNew {

    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("OK");
        arrList.add("YES");
        arrList.add("NO");
        System.out.println(arrList);

        /*
        Contoh 1
        */
       ArrayList<User> arrUser = new ArrayList<>();
       arrUser.add(new User("Paul","Paul@123"));
       arrUser.add(new User("Yudi","Yudi@123"));
       arrUser.add(new User("Verdo","Verdo@123"));
       System.out.println(arrUser);

        /*
        Contoh 2
        */
        arrUser.clear();
        User user = new User();
        user.setNamaLengkap("Fauzan");
        user.setPassword("Fauzan@123");
        System.out.println("Alamat User 1 "+user);
        arrUser.add(user);

        user = new User();
        user.setNamaLengkap("Rifki");
        user.setPassword("Rifki@123");
        System.out.println("Alamat User 2 "+user);
        arrUser.add(user);

        user = new User();
        user.setNamaLengkap("Agung");
        user.setPassword("Agung@123");
        System.out.println("Alamat User 3 "+user);
        arrUser.add(user);
        System.out.println(arrUser);

        for (User d: arrUser) {
            System.out.println("Nama Lengkap : "+d.getNamaLengkap());
            System.out.println("Password : "+d.getPassword());
        }

        Map<String,Object> map = new HashMap<>();
        map.put("id",arrUser);
        map.put("nama","Paul");
        System.out.println(map.get("id"));
        System.out.println(map.get("nama"));
        System.out.println(map);
        map.clear();
        System.out.println(map);

//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int x = sc.nextInt();
        if(x==1)
        {
            System.out.println("Masuk True");
        }
        else
        {
            try{
                cobain();
            }catch (ArithmeticException a)/*Handle Exception*/
            {
                System.out.println("Maju Jalan Lagi !!"); /*Handle Exception*/
            }
        }
        System.out.println("Berenti aman terkendali ");
    }

    public static void cobain() throws ArithmeticException{
        int intP = 1/0;
        System.out.println("COBAIN");


    }
}
