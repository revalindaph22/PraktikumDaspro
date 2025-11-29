package DasproJobsheet5;

import java.util.Scanner;

public class Tugas3JobsheetLima22Perpustakaan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Perpustakaan ---");

        System.out.println("Apakah anda membawa kartu mahasiswa? (Ya/Tidak)");
        String kartuMahasiswa = sc.nextLine();
        System.out.println("Apakah anda sudah melakukan registrasi online? (Ya/Tidak)");
        String registOnline = sc.nextLine();

        if (kartuMahasiswa.equalsIgnoreCase("Ya") || registOnline.equalsIgnoreCase("Ya")) {
            System.out.println("Boleh Masuk");
        } else {
            System.out.println("Ditolak Masuk");
        }
        sc.close();
}}