package DasproJobsheet12;
import java.util.Scanner;
public class Kafe21 { // mendeklarasi sebuah class bernama Kafe21 (wadah kode)
    public static void Menu(String namaPelanggan,String kodePromo, boolean isMember) { // mendefinisikan method bernama Menu dengan parameter bernilai teks (nama),kode promosi, pelanggan member (true/false)
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
        
        if (kodePromo.equals("DISKON50")) { // membandingkan kodePromo dengan string "DISKON50" dengan memperhatikan besar/kecil
            System.out.println("Selamat " + namaPelanggan + "! Kamu mendapatkan diskon 50%"); // jika sama maka print diskon 50%
        } else if (kodePromo.equals("DISKON30")) { // membandingkan lagi kodePromo dengan string "DISKON30" 
            System.out.println("Selamat " + namaPelanggan + "! Kamu mendapatkan diskon 30%"); // jika sama maka print diskon 30%
        } else { // jika tidak memenuhi kedua if diatas
            System.out.println("Maaf, kode promo invalid!"); // maka akan print kode invalid
        }
    } // menutup blok menu
    
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) { // method hitungTotalHarga yang mengembalikan int, parameter pilihanMenu (nomor menu), banyakItem (banyak unit dipesan)
        int[] hargaItems = {15000,20000,22000,12000,10000,18000}; // array bernama hargaItems yang menyimpan harga setiap menu
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem; // menghitung total: ambil harga dari array sesuai pilihanMenu dikurangi 1 karena array dimulai dari indeks 0, lalu dikalikan banyakItems.

        if (kodePromo.equals("DISKON50")) {
            hargaTotal -= hargaTotal * 50/100;
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal -= hargaTotal * 30/100;
        } else {
            System.out.println("Maaf, kode promo invalid!");
        }

        return hargaTotal; // mengembalikan nilai hargaTotal ke pemanggil method, setelah ini method selesai
        
    } // menutup method hitungTotalHarga
    
    public static void main(String[] args) { // method main, pintu masuk program java
        Scanner Linda = new Scanner(System.in); // membuat objek scanner bernama Linda
        
        System.out.print("Masukkan nama pelanggan: ");
        String nama = Linda.nextLine();

        System.out.print("Apakah Anda member? (true/false): ");
        boolean member = Linda.nextBoolean();
        Linda.nextLine();
        
        System.out.print("Masukkan kode promo: "); // menampilkan prompt meminta input kode promo
        String kodePromo = Linda.nextLine(); // membaca teks kode promo yang di masukkan

        Menu(nama, kodePromo, member);

        int totalAkhir = 0;
        int pilihanMenu = -1;

        while (pilihanMenu != 0) { // looping selama menu bukan 0 lanjutkan input pesanan
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (0 untuk selesai): "); // menampilkan prompt meminta input nomor menu
            pilihanMenu = Linda.nextInt(); // membaca angka yang dimasukan user ke pemilihanMenu
            
            if (pilihanMenu == 0) // jika menu di isi 0
                break; // maka behenti paksa
                
                System.out.print("Masukkan jumlah item yang ingin dipesan: "); // menampilkan prompt meminta jumlah item
                int banyakItem = Linda.nextInt(); // membaca angka ke banyakItem
                Linda.nextLine();  // untuk menghilangkan enter yang tersisa
                
            
                int hargaTotal = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo); // memanggil methodTotalHarga dengan argumen pilihanMenu dan banyakItem, hasil (total harga) disimpan di variabel hargaTotal
                System.out.println("Total harga untuk pesanan Anda: Rp " + hargaTotal); // menampilkan total harga pesana ke layar

                totalAkhir += hargaTotal;
            }         

            System.out.println("\n=================================");
            System.out.println("Total keseluruhan belanja: " + totalAkhir);
            System.out.println("Terimakasih sudah berkunjung " + nama + "!");

            Linda.close();
    }
}

/* PERTANYAAN PERCOBAAN 3
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return 
value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh 
dari program kafe pada Percobaan 3 untuk masing-masing kasus. 
    * Diperlukan return jika fungsi melakukan perhitungan dan harus memberikan hasil kembali ke pemanggil fungsi
      seperti pada kode baris ke 34-38, itu kan hasil hitungan diperlukan untuk dicetak atau dipakai lagi.
    * Tidak diperlukan return jika fungsi hanya melakukan cetak tampilan, menampilkan teks, atau poses yang tidak
      perlu mengembalikan nilai, seperti kode program pada baris ke 7- 18, itu kan hanya tampilan informasi saja.
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan 
pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua 
buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing 
parameter dalam konteks program kafe. 
    Tipe data kembaliannya yaitu Integer, parameternya yaitu pilihanMenu dan banyakItem. pilihanItem digunakan untuk
    menentukan menu yang dipilih, sedangkan banyakItem digunakan untuk menentukan jumlah item yang dipesan.
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima 
kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari 
totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka 
mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode 
promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga 
totalHarga. Modification Done
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta 
menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga 
pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 
sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis 
menu)? Modification Done.

*/