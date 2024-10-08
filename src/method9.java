import java.util.Arrays;
import java.util.Random;

public class method9 {
    public static void main(String[] args) {
        int[] a = new int[15];
        task9(a);
    }

    public static void task9(int[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            int ran;
            do {
                ran = random.nextInt(10, 100);
            } while (ran % 2 != 0);
            a[i] = ran;


        }
        System.out.println(Arrays.toString(a));
    }

}
