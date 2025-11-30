import java.util.Scanner;

public class HitungBalok21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang balok: ");
        p = input.nextInt();

        System.out.println("Masukkan lebar balok: ");
        l = input.nextInt();

        System.out.println("Masukkan tinggi balok: ");
        t = input.nextInt();

        L = p * l;
        System.out.println("Luas persegi panjang adalah " + L);
        vol = p * l * t;
        System.out.println("Volume balok adalah " + vol);

        input.close();
    }
}
