import java.util.Random;

// Time Complexity: O(n)
public class LinearSearch {
    public static void main(String[] args){
        Random rand = new Random();
        int[] arr = rand.ints(10, 1, 20).toArray();
        System.out.println("Unsorted:");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int pos = -1, find = 10;
        for(int x = 0; x<arr.length; x++){
            if(arr[x]==10){
                pos = x+1;
            }
        }
        System.out.println("Position: "+pos);
    }
}