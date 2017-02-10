import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String givenLine = "Ваша строка";
        while (true) {
            System.out.println("Введите строку: ");
            String inputLine = scanner.nextLine();
            if (inputLine.equals(givenLine)) {
                break;
            }
            System.out.printf("Нужно ввести строку \"%s\"%n", givenLine);

        }
    }
}
