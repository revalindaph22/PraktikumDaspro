package DasproJobsheet5;

import java.util.Scanner;

public class IfElseCetakKRS22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini = ");
        int semester = sc.nextInt();

        String hasil = (semester <= 8) ? 
            "KRS Semester " + semester + " ditampilkan" : 
            "Semester tidak valid";

        System.out.println(hasil);
        sc.close();
    }
}