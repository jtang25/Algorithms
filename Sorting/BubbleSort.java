import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = rand.ints(5, 1, 10).toArray();
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for(int x = 0; x<array.length-1; x++){
                if(array[x]>array[x+1]){
                    int bucket = array[x];
                    array[x] = array[x+1];
                    array[x+1] = bucket;
                    sorted = false;
                }
            }
        }
        for (int x : array){
            System.out.print(x+" ");
        }
    }
}
