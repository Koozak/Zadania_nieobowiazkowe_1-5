import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] tablica = new int[100];
        HashSet<Integer> parzyste = new HashSet<>();
        HashSet<Integer> nieparzyste = new HashSet<>();
        for(int i = 0;i<100;i++){
            int x = (int)Math.floor(Math.random() *(100 - 1 + 1) + 1);
            tablica[i]=x;
            if(x%2 == 0){
                parzyste.add(tablica[i]);
            }
            else{
                nieparzyste.add(tablica[i]);
            }
        }
        for(int i = 0;i<100;i++){
            System.out.print(" "+tablica[i]);
        }
        System.out.println();
        System.out.println(parzyste);
        System.out.println(nieparzyste);
        System.out.println(nieparzyste.size()+parzyste.size());
    }
}