import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите аргументы: ");

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double epsilon = 1e-10;

        if (Math.abs(a) <= epsilon && Math.abs(b) <= epsilon && Math.abs(c) <= epsilon) {
            System.out.print("Корень уравнения любое число");
        } else if (Math.abs(a) <= epsilon && Math.abs(b) <= epsilon) {
            System.out.print("Корней уравнения нет");
        } else if (Math.abs(a) <= epsilon) {
            double x = -c / b;
            System.out.print("Корень уравнения: x = " + x);
        } else if (discriminant <= epsilon) {
            double x = -b / (2 * a);
            System.out.print("Корень уравнения: x = " + x);
        } else if (discriminant < 0) {
            System.out.print("Вещественных корней нет");
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Корни уравнения: x1 = %.1f; x2 = %.1f", x1, x2);
        }
    }
}

