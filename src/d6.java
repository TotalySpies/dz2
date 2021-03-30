import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class d6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50) - 30;
            System.out.print(arr[i] + "");
            System.out.println();
        }
        System.out.print("\nSorted: \n");
        Arrays.sort(arr);
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }}
