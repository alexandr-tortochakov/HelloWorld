import java.util.Scanner;

public class Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputLine = scanner.nextLine();

        int letters = 0;
        int digits = 0;
        int whitespaces = 0;
        int others = 0;

        for (int i = 0; i < inputLine.length(); i++) {
            if (Character.isLetter(inputLine.charAt(i))) {
                letters++;
            } else if (Character.isDigit(inputLine.charAt(i))) {
                digits++;
            } else if (Character.isWhitespace(inputLine.charAt(i))) {
                whitespaces++;
            } else {
                others++;
            }
        }
        System.out.println("Количество букв: " + letters);
        System.out.println("Количество цифр: " + digits);
        System.out.println("Количество пробелов: " + whitespaces);
        System.out.print("Количество остальных символов: " + others);
    }
}
