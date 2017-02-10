import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "JavaRush";

        System.out.print("Введите пароль: ");
        String inputPassword = scanner.nextLine();

        if (inputPassword.equals(password)) {
            System.out.print("Доступ разрешен");
        } else if (inputPassword.length() > password.length()) {
            System.out.print("Введеный пароль слишком длинный");
        } else if (inputPassword.length() < password.length()) {
            System.out.print("Введеный пароль слишком короткий");
        } else {
            System.out.print("В доступе отказано");
        }
    }
}