package DasproJobsheet12;

// deklarasi Fungsi harus sebelum method main
public class Kafe21 { // mendeklarasi sebuah class bernama Kafe21 (wadah kode)
    public static void Menu(String namaPelanggan,String kodePromo, boolean isMember) { // mendefinisikan method bernama Menu dengan parameter bernilai teks (nama) dan true/false
        System.out.println("Selamat datang, " + namaPelanggan + "!"); // print sapaan pelanggan dengan memasukkan parameter nama pelanggan
        
        System.out.println("==== MENU RESTO KAFE ===="); // mencetak ke layar
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Capuccino - Rp 20,000");
        System.out.println("3. Capuccino - Rp 20,000");
        System.out.println("4. Capuccino - Rp 20,000");
        System.out.println("5. Capuccino - Rp 20,000");
        System.out.println("6. Capuccino - Rp 20,000");
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
    public static void main(String[] args) { // method main, pintu masuk program java
        Menu("Andi", "DISKON50", true); // memanggil method Menu, dengan menambahkan parameter namaPelanggan dan True untuk isMember
    }
}

/* PERTANYAAN PERCOBAAN 2
1. Apakah kegunaan parameter di dalam fungsi?
    Digunakan untuk membawa data masuk ke dalam fungsi, bisa membuat fungsi menjadi dinamis karena output bisa berubah sesuai input,
    dan juga dapat membantu fungsi untuk memproses data sesuai kebutuhan pengguna.
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember? 
    Parameter namaPelanggan digunakan untuk menampilkan sapaan kepada pelanggan sesuai dengan nama pelanggannya ke layar, sedangkan
    parameter isMember digunakan untuk mengecek pelanggan itu member atau bukan agar program dapat memberikan diskon.
3. Apakah parameter sama dengan variabel? Jelaskan.
    Tidak sama, parameter dipakai untuk menerima data ketika fungsi dipanggil, sedangkan vaiabel biasa dipakai untuk menerima data
    di dalam program.
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa 
perbedaan output ketika isMember bernilai true dan ketika false? 
    Parameter isMember digunakan untuk mengecek apakah pelanggan adalah member atau bukan. Nilai yang dikirim bisa berupa true
    (pelanggan merupakan member dan mendapatkan diskon) atau false (pelanggan bukan member dan tidak mendapatkan diskon).
    Nilai ini digunakan pada kondisi if.
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember? 
    Akan error, karena fungsi Menu ini harus memanggil "nama pelanggan" dan "apakah dia member", jika tidak diberi maka java
    tidak tahu nilai apa yang harus dimasukkan ke namaPelanggan dan isMember.
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50",
tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode 
promo yang berlaku, tampilkan kode invalid. Modification Done.
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan
kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar. 
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah
dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? 
Jelaskan alasan Anda.
 */
