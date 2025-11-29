package DasproJobsheet12;

import java.net.Socket;
// deklarasi Fungsi harus sebelum method main
public class Kafe21 { // mendeklarasi sebuah class bernama Kafe21 (wadah kode)
    public static void Menu(String namaPelanggan, boolean isMember) { // mendefinisikan method bernama Menu dengan parameter bernilai teks (nama) dan true/false
        System.out.println("Selamat datang, " + namaPelanggan + "!"); // print sapaan pelanggan dengan memasukkan parameter nama pelanggan

        if (isMember) { // chek apakah pelanggan adalah member (isMember = True)
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        } // jika true print diskon, jika false tidak di print (di lewati)

        System.out.println("==== MENU RESTO KAFE ===="); // mencetak ke layar
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Capuccino - Rp 20,000");
        System.out.println("3. Capuccino - Rp 20,000");
        System.out.println("4. Capuccino - Rp 20,000");
        System.out.println("5. Capuccino - Rp 20,000");
        System.out.println("6. Capuccino - Rp 20,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    } // menutup blok menu
    public static void main(String[] args) { // method main, pintu masuk program java
        Menu("Andi", true); // memanggil method Menu, dengan menambahkan parameter namaPelanggan dan True untuk isMember
    }
}
