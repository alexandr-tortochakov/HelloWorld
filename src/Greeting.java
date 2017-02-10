import java.util.Locale;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String inputName = scanner.nextLine();
        System.out.print("Здравствуйте, " + inputName + "!");
    }
}
