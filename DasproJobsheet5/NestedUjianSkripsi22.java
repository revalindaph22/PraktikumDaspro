package jobsheet5;

import java.util.Scanner;

public class NestedUjianSkripsi22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")){
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                System.out.println("Semua syarat terpenuhi, Mahasiswa boleh mendaftar ujian skripsi");
            }else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                System.out.println("Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali");
            } else if (bimbinganP1 < 8) {
                 System.out.println("Gagal log bimbingan P1 belum mencapai 8 kali");
            }  else {
                System.out.println();
            }
    } else {
        System.out.println("Gagal Mahasiswa masih memiliki tanggunagan kompen");
    }
    sc.close();
}}