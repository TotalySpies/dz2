import java.util.Random;

public class d4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50)-30;
            System.out.print(arr[i] + "");
            System.out.println();
        }
    }
}
