public class HitungBalok21 {
    static void TampilHinggaKei(int i) {
        for (int j = 0; j <= i; j++) {
            System.out.print(j);
        }
    }

    static int Jumlah(int bil1, int bil2){
        return (bil1 + bil2);
    }

    static void TampilJumlah(int bil1, int bil2) {
        TampilHinggaKei(Jumlah(bil1,bil2));
    }


    public static void main(String[] args) {
        int temp = Jumlah(1,1);
        TampilJumlah(temp, 5);
    }
}

/* PERTANYAAN PERCOBAAN 5
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok! 
    1) program mulai dari method main()
    2) scanner bernama input dibuat untuk membaca input user
    3) program meminta input panjang balok (p)
    4) user memasukkan panjang baloknya misalnya 30
    5) program meminta input lebar balok (l)
    6) user memasukkan lebar balok misalnya 20
    7) program meminta input tinggi balok (t)
    8) user memasukkan tinggi balok misalnya 40
    9) program memanggil method hitungLuas(p,l) dimana itu menghitung Luas = p*l
    10) hasil luas dikembalikan ke method main
    11) program menampilkan luas persegi panjang (alas balok)
    12) program memanggil method hitungVolume(t.p.l), fungsi ini manggil method luas lalu dikalikan dengan tinggi
    13) hasil volume dikembalikan ke method main
    14) program menampilkan hasil volume balok

2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.
    1) program mulai dari method main()
    2) scanner bernama input dibuat untuk membaca input user
    3) program meminta input panjang balok (p)
    4) user memasukkan panjang baloknya misalnya 4
    5) program meminta input lebar balok (l)
    6) user memasukkan lebar balok misalnya 3
    7) program meminta input tinggi balok (t)
    8) user memasukkan tinggi balok misalnya 5
    9) program memanggil method hitungLuas(p,l) dimana itu menghitung Luas = p*l = 4*3 = 12
    10) hasil luas dikembalikan ke method main
    11) program menampilkan luas persegi panjang (alas balok) = 12
    12) program memanggil method hitungVolume(t.p.l), fungsi ini manggil method luas lalu dikalikan dengan tinggi
        L*t = 12*5 = 60
    13) hasil volume dikembalikan ke method main
    14) program menampilkan hasil volume balok = 60
    15) output :
        Masukkan panjang balok: 4
        Masukkan lebar balok: 3
        Masukkan tinggi balok: 5
        Luas persegi panjang adalah 12
        Volume Balok adalah 60

3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!
    1) program dimulai dari method main
    2) int temp = Jumlah(1,1); untuk memanggil Jumlah(1,1) dimana itu akan dihitung Jumlah = 1 + 1 maka menghasilkan temp = 2
    3) program akan menjalankan TampilJumlah(temp, 5) itu sama aja kaya TampilJumlah(2,5)
    4) fungsi TampilJumlah(2,5) dijalankan TampilHinggaKei(Jumlah(2,5)); dimana itu sama aja 2+5 = 7
    5) Fingsi TampilHinggaKei(7) akan mencetak angka dari 0-7
    6) output nya akan => 01234567

4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!
    * Fungsi memakai parameter jika butuh nilai dari luar fungsi agat dapat dihitung
      contoh : hitungLuas(p,l) yang membutuhkan input panjang dan lebar dari user
    * Fungsi Tidak Memakai Parameter jika data sudah tersedia di dalam fungsi itu sendiri atau global atau hanya menampilkan teks tanpa hitungan
      contoh : tampilSalam() hanya manggil fungsi aja tanpa parameter
    * Fungsi Memakai Retrun jika ingin hasil perhitungan dipakai kembali
      contoh : return Luas; // return Volume; 
    * Fungsi Tidak Perlu Return jika hanya melakukan proses tanpa menghasilkan nilai, misal hanya menampilkan print teks seperti main()

5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5. 
    saat hitungLuas(p,l) ini menggunakan parameter karena panjang dan lebarnya harus di input user, fungsi tidak tau jika user tudak menginput nilai, dan nilainya berbeda-beda
    saat hitungVolume(t,p,l) ini menggunakan parameter karena fungsi ini butuh tinggi, panjang, dan lebar dari user untuk menghitung volume, dan nilainya berbeda beda
    saat hitungLuas() // hitungVolume() ini tidak usah pakai parameter karena panjang lebar tinggi sudah bernilai tetap, misalnya sellau p=5, l=4, t=9

6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.
    return Luas; // return Volume harus menggunakan return karena pada program butuh hasil luas di main dn juga butuh hasilnya untuk dicetak
    main() itu tidak pakai return karena hanya menjalankan program dan mencetak hasil, tidak perlu mengembalikan nilai ke siapapun
*/