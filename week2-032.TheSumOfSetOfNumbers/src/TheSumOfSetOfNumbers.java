
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int end = Integer.parseInt(reader.nextLine());
        int i = 1;
        int result = 0;
        while (i <= end) {
            result += i;
            i += 1;
        }
        System.out.println("Sum is "+result);
    }
}
