/*Nama : Juita Mandasari
  Stambuk : 13020210094*/

import java.util.Scanner;

public class Hitung0094 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dollar, rupiah;
        final double KURS_DOLLAR_RUPIAH = 15094.80;

        // Meminta input dari pengguna
        System.out.print("Dollar: ");
        dollar = input.nextDouble();

        // Menghitung konversi dari dollar ke rupiah
        rupiah = dollar * KURS_DOLLAR_RUPIAH;

        // Menampilkan hasil konversi
        System.out.println("Hasil : " + dollar + " dollar = " + (int)rupiah + " Rupiah");
    }
}
