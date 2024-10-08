import java.util.Arrays;
import java.util.Random;

public class method2 {
    public static void main(String[] args) {
        boolean[]arrb=new boolean[20];
      task2(arrb);
    }
    public static void task2(boolean[]tf){
        Random random = new Random();
        int count=0;
        for (int i = 0; i < tf.length ; i++) {
            tf[i]= random.nextBoolean();
            if (tf[i]==true){
                count++;
            }

        }
        System.out.println(Arrays.toString(tf));
        System.out.println(count);

    }
}
