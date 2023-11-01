import java.util.Scanner;

public class Pra01 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int angka1, angka2, angka3;

        angka1 = scan.nextInt();
        angka2 = scan.nextInt();
        angka3 = scan.nextInt();

        pisahkanBaris(angka1);
        pisahkanBaris(angka2);
        pisahkanBaris(angka3);
    }

    private static void pisahkanBaris(int angka) {
        String dalamString = String.valueOf(angka);

        int baris1 = Integer.valueOf(dalamString.substring(0,1));
        int baris2 = Integer.valueOf(dalamString.substring(1,2));
        int baris3 = Integer.valueOf(dalamString.substring(2,3));
        int baris4 = Integer.valueOf(dalamString.substring(3,4));

        int hasilBaris1 = enkripsi(baris1);
        int hasilBaris2 = enkripsi(baris2);
        int hasilBaris3 = enkripsi(baris3);
        int hasilBaris4 = enkripsi(baris4);
        
        System.out.printf("%d%d%d%d\n", hasilBaris1, hasilBaris4, hasilBaris3, hasilBaris2);
    }
    
    private static int enkripsi(int angka) {
        return (angka + 5) % 10;
    }
}