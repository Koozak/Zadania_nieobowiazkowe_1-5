
public class Main {
    public static void main(String[] args) {
        float[] tablica = new float[10];
        float x = 0;
        for(int i = 0;i<10;i++){
            tablica[i] = (float) Math.sqrt(x);
            x++;
        }
        for(int i = 0;i<10;i++){
            System.out.println(tablica[i]);
        }
    }
}