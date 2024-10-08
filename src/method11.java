import java.util.Scanner;

public class method11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Said", "Enes", "Zhirgalbek", "Adilet", "Eleman", "Aizat"};
        String name = scanner.nextLine();

        if (tf(names, name)) {
            System.out.println("name is fonded and index is even");
        } else {
            System.out.println("name is't founded or index is odd");
        }


    }

    public static boolean tf(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i % 2 == 0;
            }
        }
        return false;
    }
}
