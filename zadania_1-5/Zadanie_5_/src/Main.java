public class Main {
    public static int liczbyPierwsze(int x) {
        if (x <= 1) {
            return 0;
        }
        for (int i = 2; i <= x-1; i++) {
            if (x % i == 0) {
                return 0;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        int[] tablica = new int[1000];

        for(int i = 0;i<1000;i++) {
            tablica[i]=liczbyPierwsze(i);
        }
        for(int i = 0;i<1000;i++){
            if(tablica[i]!=0) {
                System.out.print(" " + tablica[i]);
            }
        }

    }
}