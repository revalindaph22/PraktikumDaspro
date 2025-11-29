package DasproJobsheet12;

public class Kafe21 { // mendeklarasi sebuah class bernama Kafe21 (wadah kode)
    public static void main(String[] args) { // method main, pintu masuk program java
        System.out.println("==== MENU RESTO KAFE ===="); // mencetak ke layar
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Capuccino - Rp 20,000");
        System.out.println("3. Capuccino - Rp 20,000");
        System.out.println("4. Capuccino - Rp 20,000");
        System.out.println("5. Capuccino - Rp 20,000");
        System.out.println("6. Capuccino - Rp 20,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
}

/* PERTANYAAN PERCOBAAN 1
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
    Fungsi tanpa parameter tidak harus bertipe void, karena parameter dan return type itu dua hal yang
    berbeda. Parameter berhubungan dengan "apakah fungsi menerima input", sedangkan Return type berhubungan
    dengan "apakah fungsi menghasilkan output". Jadi meskipun tidak punya parameter, fungsi tetap bisa
    mengembalikan nilai, sehingga tidak harus void.
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi 
Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu 
tanpa menggunakan fungsi!
    Bisa, Menu bisa ditampilkan tanpa menggunakan fungsi Menu(), langsung tuliskan System.out.println()
    di dalam main(). Modification Done.
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua 
perintah penampilan menu langsung di dalam fungsi main. 
    Kode lebih rapi, tidak ribet mengulangi baris print jika ingin dipanggil, memudahkan membacanya,
    memudahkan pengembangan program jika program makin besar, memudahkan pemeliharaan (maintenance) 
    jika ada menu baru
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main 
(mulai dari program dijalankan sampai daftar menu tampil di layar). 
    Membuat class bernama Kafe21 sebagai wadah program, lalu mendefinisi sebuah method (kumpulan perintah) bernama Menu,
    lalu memanggil S.O.P untuk mencetak judul menu, menu ke 1,2,3,4,5,6, garis pembatas, dan instruksi ke user untuk 
    memilih menu ke layar, } menutup blok method Menu. Selanjutnya menjalankan method main (pintu masuk utama java) maka
    progam akan mulai berjalan dan setelahnya memanggil method Menu tanpa parameter/objek, } menutup blok method main,
    } menutup blok class Kafe21, setelah itu program di run dan keluar output an menu kafe.
*/
