import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class method4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(array));
        task4(n, array);

    }

    public static void task4(int n, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;

            }
        }
        System.out.println(count);

    }

}
