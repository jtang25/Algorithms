import java.util.*;

// Time Complexity: O(log n)
public class BinarySearch {
    public static void main(String[] args){
        Random rand = new Random();
        int[] arr = rand.ints(10, 1, 20).toArray();
        Arrays.sort(arr);
        System.out.println("Array:");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println("Find: 10");
        int pos = arr.length/2, upperLimit = arr.length, lowerLimit = 0, find = 10;
        while(true){
            if(arr[pos]==find){
                break;
            }
            else if(arr[pos]>find){
                upperLimit = pos;
                pos = (pos+lowerLimit)/2;
            }
            else if(arr[pos]<find){
                lowerLimit = pos;
                pos = (pos+upperLimit)/2;
            }
            if(pos==upperLimit || pos==lowerLimit){
                pos = -1;
                break;
            }
        }
        System.out.println("Position: "+pos);
    }
}