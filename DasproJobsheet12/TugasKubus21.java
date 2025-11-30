import java.util.Scanner;

public class TugasKubus21 {
    static int hitungLuasPermukaan(int sisi) {
        int LuasPermukaan = 6 * (sisi * sisi);
        return LuasPermukaan;
    }

    static int hitungVolume(int sisi) {
        int volume = hitungLuasPermukaan(sisi) * sisi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, L, vol;

        System.out.print("Masukkan sisi kubus: ");
        s = input.nextInt();

        L = hitungLuasPermukaan(s);
        System.out.println("Luas permukan kubus adalah " + L);

        vol = hitungVolume(s);
        System.out.println("Volume kubus adalah " + vol);

        input.close();
    }
}
