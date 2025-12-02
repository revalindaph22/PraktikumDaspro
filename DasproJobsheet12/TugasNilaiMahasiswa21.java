
import java.util.Scanner;

public class TugasNilaiMahasiswa21 {

    static Scanner sc = new Scanner(System.in);

    static void IsianArray(int[] jumlah) {
        for (int i = 0; i < jumlah.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1) + ": ");
            jumlah[i] = sc.nextInt();
        }
    }

    static void TampilArray(int[] nilai) {
        System.out.println("\n Nilai mahasiswa : ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke- " + (i+1) + ": " + nilai[i]);
        }
    }

    public static int HitTot(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] NilaiMahasiswa = new int [N];

        IsianArray(NilaiMahasiswa);

        TampilArray(NilaiMahasiswa);

        int TotalNilai = HitTot(NilaiMahasiswa);
        System.out.println("\nTotal nilai mahasiswa: " + TotalNilai);

    }
}
