import java.util.Arrays;
import java.util.Random;

public class method3 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        task3(arr);
    }

    public static void task3(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 50);
            if (arr[i] > 20) {
                System.out.print(arr[i] + " ,");
            }
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(arr));
    }
}
