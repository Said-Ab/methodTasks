import java.util.Scanner;

public class method8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(dayOfWeek(a));

    }

    public static String dayOfWeek(int a) {
        switch (a) {
            case 1:
                return "Понидельник";

            case 2:
                return "Вторник";

            case 3:
                return "Среда";

            case 4:
                return "Четверг";

            case 5:
                return "Пятница";

            case 6:
                return "Суббота";

            case 7:
                return "Воскрисенье";

            default:
                return "такого нет";
        }

    }
}
