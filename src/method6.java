import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class method6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write any INDEX from 0 to 20");
        int t = scanner.nextInt();
        task6(t);

    }

    public static void task6(int k) {
        int summ = 0;
        Random random = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 100);

        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < k; j++) {
            System.out.print(arr[j] + ", ");
            summ += arr[j];
        }
        System.out.println(" ");
        System.out.println(summ);
    }
}
