package DasproJobsheet12;
public class PengunjungCafe21 {

    public static void daftarPengunjung(String...namaPengunjung){
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}

/* PERTANYAAN PERCOBAAN 4
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String...namaPengunjung!
    Karena String... adalah varargs (variabel arguments) yang memungkinkan method menerima jumlah parameter yang tidak terbatas
    sehinggan pemanggilan bisa fleksibel atau bahkan tanpa jumlah tetap. String... membuat kode lebih ringkas dan fleksibel.
2. Modifikasi method daftarPengunjung menggunakan for-each loop. Modification Done.
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban 
Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
    Tidak boleh lebih dari satu varargs (...) dalam satu method, java akan error karena varargs harus menjadi parameter terakhir.
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. 
Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? 
Jika tetap berjalan, bagaimana output yang dihasilkan? 
    Program tidak akan error dan akan tetap berjalan, karena varargs memperlakukan input sebagai array kosong ([])
    jadi hanya akan menampilkan daftar kosong "Daftar Nama Pengunjung: " saja yang ditampilkan.
*/