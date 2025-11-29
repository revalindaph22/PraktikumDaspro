package DasproJobsheet12;

import java.util.Scanner;

// deklarasi Fungsi harus sebelum method main
public class Kafe21 { // mendeklarasi sebuah class bernama Kafe21 (wadah kode)
    public static void Menu(String namaPelanggan,String kodePromo, boolean isMember) { // mendefinisikan method bernama Menu dengan parameter bernilai teks (nama) dan true/false
        System.out.println("Selamat datang, " + namaPelanggan + "!"); // print sapaan pelanggan dengan memasukkan parameter nama pelanggan
        
        System.out.println("==== MENU RESTO KAFE ===="); // mencetak ke layar
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Capuccino - Rp 20,000");
        System.out.println("3. Capuccino - Rp 22,000");
        System.out.println("4. Capuccino - Rp 12,000");
        System.out.println("5. Capuccino - Rp 10,000");
        System.out.println("6. Capuccino - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
        
        if (isMember) { // chek apakah pelanggan adalah member (isMember = True)
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        } // jika true print diskon, jika false tidak di print (di lewati)
        
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Selamat " + namaPelanggan + "! Kamu mendapatkan diskon 50%");
            if (kodePromo.equalsIgnoreCase("DISKON30")) {
                System.out.println("Selamat " + namaPelanggan + "! Kamu mendapatkan diskon 30%"); 
            }
        } else {
            System.out.println("Maaf kode invalid!");
        }
    } // menutup blok menu
    
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000,20000,22000,12000,10000,18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
        
    }
    
    public static void main(String[] args) { // method main, pintu masuk program java
        Scanner Linda = new Scanner(System.in);

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = Linda.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = Linda.nextInt();

        int hargaTotal = hitungTotalHarga(pilihanMenu, banyakItem);

        System.out.println("Total harga untuk pesanan Anda: Rp" + hargaTotal);

        Menu("Andi", "DISKON40", false); // memanggil method Menu, dengan menambahkan parameter namaPelanggan dan True untuk isMember
    }
}