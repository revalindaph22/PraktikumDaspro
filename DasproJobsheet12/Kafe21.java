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
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main 
(mulai dari program dijalankan sampai daftar menu tampil di layar).
*/
