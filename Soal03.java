import java.util.Locale;
import java.util.Scanner;

public class Soal03 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String kelamin;
        double beratBadan, tinggiBadan;

        kelamin = scan.next();
        beratBadan = scan.nextDouble();
        tinggiBadan = scan.nextDouble() / 100;

        double skorBmi = hitungBmi(beratBadan, tinggiBadan);
        String kategori = dapatkanKategori(kelamin, skorBmi);

        System.out.printf(Locale.US, "%.2f, %s", skorBmi, kategori);
    }

    private static double hitungBmi(double beratBadan, double tinggiBadan) {
        double hasilBmi = beratBadan / (tinggiBadan * tinggiBadan);
        return hasilBmi;
    }

    private static String dapatkanKategori(String kelamin, double skorBmi) {
        String kategori = "";

        switch (kelamin.toLowerCase()) {
            case "pria":

                if (skorBmi < 20.50) {
                    kategori = "Kurus";
                } else if (skorBmi >= 20.50 && skorBmi <= 26.99) {
                    kategori = "Ideal";
                } else if (skorBmi >= 27.00) {
                    kategori = "Gemuk";
                }
                break;
            case "wanita":
                if (skorBmi < 18.50) {
                    kategori = "Kurus";
                } else if (skorBmi >= 18.50 && skorBmi <= 24.99) {
                    kategori = "Ideal";
                } else if (skorBmi >= 25.00) {
                    kategori = "Gemuk";
                }
                break;
        }

        return kategori;
    }
}
