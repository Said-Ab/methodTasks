import java.util.Arrays;
import java.util.Random;

public class method13 {
    public static void main(String[] args) {
        Random random= new Random();
        int []abb=new int[5];
        for (int i = 0; i < abb.length; i++) {
            abb[i]= random.nextInt(-5,50);
        }
        System.out.println(Arrays.toString(abb));
        System.out.println(ab(abb));

    }
    public static boolean ab(int[]ba){
        int count=0;
        for (int i = 0; i < ba.length ; i++) {
            if (ba[i]<0){
                count++;
            }

        }
        if (count==0){
            return true;
        }
        else {
            return false;
        }

    }
}
