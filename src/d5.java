import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class d5 {
    public static void main(String[] args) {

        int[] arr = new int[4];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50)-30;
            System.out.print(arr[i] + "");
            System.out.println();
        }
        System.out.print("Инвертированный массив:");
        for (int i=0;i<arr.length/2;i++){
            int tmp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=tmp;
        }
        System.out.println(Arrays.toString(arr));




}}
