import java.util.Random;

// Time Complexity: O(n^2)
public class SelectionSort {
    public static void main(String[] args){
        Random rand = new Random();
        int[] arr = rand.ints(10, 1, 20).toArray();
        boolean sorted = false;
        System.out.println("Unsorted:");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int counter = 0;
        for(int x = 0; x<arr.length-1; x++){
            int min = x;
            boolean changed = false;
            for(int y = x; y<arr.length; y++){
                if(arr[y]<arr[min]){
                    min = y;
                    changed = true;
                }
            }
            if(changed){
                counter++;
            }
            int bucket = arr[x];
            arr[x] = arr[min];
            arr[min] = bucket;
        }
        System.out.println("Sorted in "+counter+" iterations:");
        for (int x : arr){
            System.out.print(x+" ");
        }

    }
}