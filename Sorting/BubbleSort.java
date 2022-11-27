import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = rand.ints(5, 1, 10).toArray();
        System.out.println("Unsorted:");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for(int x = 0; x<array.length-1; x++){
                if(array[x]>array[x+1]){
                    int bucket = array[x];
                    array[x] = array[x+1];
                    array[x+1] = bucket;
                    sorted = false;
                    counter++;
                }
            }
        }
        System.out.println("Sorted in "+counter+" iterations:");
        for (int x : arr){
            System.out.print(x+" ");
        }
    }
}
