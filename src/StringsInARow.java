public class StringsInARow {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            i++;
            System.out.printf("%5d", i);
            if (i % 10 == 0) {
                System.out.println(System.lineSeparator());
            }
        }
    }
}
