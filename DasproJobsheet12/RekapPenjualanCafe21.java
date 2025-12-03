import java.util.Scanner;

public class RekapPenjualanCafe21 {

    static Scanner sc = new Scanner(System.in);
    static String[] menu = {"Kopi\t", "Teh\t", "Es Kelapa", "Roti Bakar", "Gorengan"};

    public static void InputData(int arr[][]) {
        System.out.println("=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan data penjualan menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void TampilData(int arr[][]) {
        System.out.println("\n=== DATA PENJUALAN ===");
        System.out.print("Menu\\Hari\t");
        for (int d = 1; d <= 7; d++) {
            System.out.print("H" + d + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void MenuTertinggi(int arr[][]) {
        int maxTotal = 0;
        String maxMenu = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += arr[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                maxMenu = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi selama 7 hari:");
        System.out.println(maxMenu + " dengan total penjualan = " + maxTotal);
    }

    public static void RataRata(int arr[][]) {
        System.out.println("\n=== RATA-RATA PENJUALAN MENU ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += arr[i][j];
            }
            double rata = total / 7.0;
            System.out.println(menu[i] + " = " + rata);
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[5][7];

        InputData(arr);
        TampilData(arr);
        MenuTertinggi(arr);
        RataRata(arr);
    }
}
