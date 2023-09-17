import java.util.Arrays;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        int[] tablica = new int[100];
        int sr = 0;
        int dominanta = 0;
        int licznik = 1;
        int wynik;
        for (int i = 0; i < 100; i++) {
            tablica[i] = (int)(Math.random() * 100 - 1);
        }
        Arrays.sort(tablica);
        System.out.println(tablica[50]);
        for (int i = 0;i<100;i++){
            sr += tablica[i];
        }
        wynik = sr/100;
        System.out.println(wynik);

    }
}