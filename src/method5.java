import java.util.Scanner;

public class method5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(task5(scanner.nextInt()));
    }

    public static int task5(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;

    }
}
