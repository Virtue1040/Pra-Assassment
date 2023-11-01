import java.util.Scanner;

public class Soal02 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int angka1, angka2;

        angka1 = scan.nextInt();
        angka2 = scan.nextInt();

        int hasil = angka1 + angka2;

        pisahkanBaris(hasil);
    }

    private static void pisahkanBaris(int angka) {
        String dalamString = String.valueOf(angka);

        int baris1 = Integer.valueOf(dalamString.substring(0, 1));
        int baris2 = Integer.valueOf(dalamString.substring(1, 2));
        int baris3 = Integer.valueOf(dalamString.substring(2, 3));

        String hasilBaris1 = dapatkanLisan(baris1);
        String hasilBaris2 = dapatkanLisan(baris2);
        String hasilBaris3 = dapatkanLisan(baris3);

        System.out.printf("%s ratus %s puluh %s", hasilBaris1, hasilBaris2, hasilBaris3);
    }

    private static String dapatkanLisan(int angka) {
        String lisan = "";
        switch (angka) {
            case 1:
                lisan = "satu";
                break;
            case 2:
                lisan = "dua";
                break;
            case 3:
                lisan = "tiga";
                break;
            case 4:
                lisan = "empat";
                break;
            case 5:
                lisan = "lima";
                break;

            case 6:
                lisan = "enam";
                break;

            case 7:
                lisan = "tujuh";
                break;
            case 8:
                lisan = "delapan";
                break;
            case 9:
                lisan = "sembilan";
                break;
        }

        return lisan;
    }
}
