import java.util.Locale;
import java.util.Scanner;


public class Switch {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Введите код команды: ");
        int command = scanner.nextInt();

        switch (command) {
            case 1:
                double addition = firstNumber + secondNumber;
                System.out.print("Результат сложения = " + addition);
                break;
            case 2:
                double subtraction = firstNumber - secondNumber;
                System.out.print("Результат вычитания = " + subtraction);
                break;
            case 3:
                double multiplication = firstNumber * secondNumber;
                System.out.print("Результат умножения = " + multiplication);
                break;
            case 4:
                double division = firstNumber / secondNumber;
                System.out.print("Результат деления = " + division);
                break;
            default:
                System.out.print("Неизвестная команда");
        }
   }
}

