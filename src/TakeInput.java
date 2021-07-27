import java.util.Scanner;

public class TakeInput {
    public static String takeInputText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text to print: ");
        return scanner.nextLine();
    }
}
