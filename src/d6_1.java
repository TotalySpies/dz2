import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class d6_1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50) - 30;
            System.out.println(arr[i]);
        }
        System.out.print("\nSorted: \n");
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
}}
