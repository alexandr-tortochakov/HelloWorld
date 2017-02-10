import java.util.Locale;
import java.util.Scanner;

public class SwitchPrintSum {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите команду: ");
        String command = scanner.nextLine();

        switch (command) {
            case "print":
                System.out.print("Введите строку: ");
                String inputString = scanner.nextLine();
                System.out.print(inputString);
                break;
            case "sum":
                System.out.print("Введите первое число: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("Введите второе число: ");
                double secondNumber = scanner.nextDouble();
                System.out.print("Сумма чисел = " + (firstNumber + secondNumber));
                break;
            default:
                System.out.print("Неизвестная команда");
        }
    }
}
