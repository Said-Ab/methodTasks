import java.util.Arrays;
import java.util.Random;

public class method7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 100);
        }
        System.out.println("Full array" + Arrays.toString(arr));
        System.out.println("only jup" + Arrays.toString(task7(arr)));

    }

    public static int[] task7(int[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                c++;
            }
        }
        int[] array = new int[c];
        int a = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                array[a++] = arr[j];
            }
        }
        return array;
    }


}
