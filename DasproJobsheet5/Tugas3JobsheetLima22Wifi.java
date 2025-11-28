package jobsheet5;

import java.util.Scanner;

public class Tugas3JobsheetLima22Wifi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Sistem Akses WiFi Kampus ---");
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lainnya): ");
        String pengguna = input.nextLine().toLowerCase();

        if (pengguna.equals("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen).");
        } else if (pengguna.equals("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = input.nextInt();
            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif).");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12.");
            }
        } else {
            System.out.println("Akses ditolak.");
        }

        input.close();
    }
}