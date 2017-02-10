import java.util.Locale;
import java.util.Scanner;

public class СomparisonDoubles {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        double epsilon = Math.pow(0.1, 200);

        if (Math.abs(firstNumber - secondNumber) <= epsilon) {
            System.out.print("Числа равны");
        } else {
            System.out.print("Числа не равны");
        }
    }

}
