import java.util.Locale;
import java.util.Scanner;

public class Triangle {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите координаты:");
        
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        System.out.print("x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("y3: ");
        double y3 = scanner.nextDouble();

        double epsilon = Math.pow(0.1, 20);
        if (Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) <= epsilon) {
            System.out.print("Точки лежат на одной прямой");
        } else {
            double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            double b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
            double c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Площадь треугоульника = %.2f", area);
        }

    }
}
