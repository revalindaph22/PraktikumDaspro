import java.util.Scanner;

public class RekapPenjualanCafe21 {

    static Scanner sc = new Scanner(System.in);
    static String[] menu;
    static int JumlahMenu;
    static int JumlahHari;

    public static void InputData(int arr[][]) {
        System.out.println("=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < JumlahMenu; i++) {
            System.out.println("Masukkan data penjualan menu: " + menu[i]);
            for (int j = 0; j < JumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void TampilData(int arr[][]) {
        System.out.println("\n=== DATA PENJUALAN ===");
        System.out.print("Menu\\Hari\t");
        for (int d = 1; d <= JumlahHari; d++) {
            System.out.print("H" + d + "\t");
        }
        System.out.println();

        for (int i = 0; i < JumlahMenu; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < JumlahHari; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void MenuTertinggi(int arr[][]) {
        int maxTotal = 0;
        String maxMenu = "";

        for (int i = 0; i < JumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < JumlahHari; j++) {
                total += arr[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                maxMenu = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi selama :");
        System.out.println(maxMenu + " dengan total penjualan = " + maxTotal);
    }

    public static void RataRata(int arr[][]) {
        System.out.println("\n=== RATA-RATA PENJUALAN MENU ===");
        for (int i = 0; i < JumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < JumlahHari; j++) {
                total += arr[i][j];
            }
            double rata = total / 7.0;
            System.out.println(menu[i] + " = " + rata);
        }
    }

    public static void main(String[] args) {
        System.out.println("Masukkan jumlah menu: ");
        JumlahMenu = sc.nextInt();
        sc.nextLine();

        menu = new String[JumlahMenu];

        System.out.println("\nMasukkan menu: ");
        for (int i = 0; i < JumlahMenu; i++) {
            System.out.println("Menu ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();
        }

        System.out.println("\nMasukkan jumlah hari penjualan: ");
        JumlahHari = sc.nextInt();

        int[][] arr = new int[JumlahMenu][JumlahHari];

        InputData(arr);
        TampilData(arr);
        MenuTertinggi(arr);
        RataRata(arr);
    }
}
