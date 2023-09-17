public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int pomoc1 = 0;
        int[] tablica = new int[40];
        for(int i = 0;i<40;i++){
            tablica[i] = a;
            pomoc1 = a;
            a += b;
            b = pomoc1;



        }
        for(int i = 0;i<40;i++){
            System.out.println(tablica[i]);
        }
    }
}
