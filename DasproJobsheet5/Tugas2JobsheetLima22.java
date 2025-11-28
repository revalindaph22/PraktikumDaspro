package jobsheet5;

import java.util.Scanner;

public class Tugas2JobsheetLima22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Ganjil & Genap ---");
        System.out.print("Masukkan angka = ");
        int angka = sc.nextInt();

        String hasil = (angka % 2 == 0) ?
            "Angka" + angka + "Merupakan angka Genap" :
            "Merupakan angka Ganjil";

        System.out.println(hasil);
        sc.close();
    }
}