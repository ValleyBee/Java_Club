import java.util.Scanner;

public class task9 {
    public static int makeNegative(final int x) {
        if (x > 0) {
            return -x;
        } else if (x < 0) {
            return x;
        } else {
            return 0;
        }


    }
    public static void execute(Scanner sc) {
        System.out.println("This program makes negative number");

    }
}
