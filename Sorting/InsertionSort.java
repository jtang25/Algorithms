import java.util.Random;

// Time Complexity: O(n^2)
public class InsertionSort {
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
        for(int x = 1; x<arr.length; x++){
            if(arr[x-1]>arr[x]){
                int y = x-1;
                while(arr[y]>arr[x]){
                    y--;
                    if(y<0){
                        break;
                    }
                }
                y++;
                int bucket = arr[x];
                for(int z = x; z>y; z--){
                    arr[z] = arr[z-1];
                }
                arr[y] = bucket;
                counter++;
            }
        }
        System.out.println("Sorted in "+counter+" iterations:");
        for (int x : arr){
            System.out.print(x+" ");
        }

    }
}