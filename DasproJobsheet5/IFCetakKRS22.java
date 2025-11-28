package jobsheet5;
import java.util.Scanner;

public class IFCetakKRS22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String hasil = (uktLunas) ?
            "Pembayaran UKT terverifikasi" :
            "Silahkan cetak KRS dan minta tanda tangan DPA";

        System.out.println(hasil);
            sc.close();
        }
    }

