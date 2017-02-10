public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("        ");
        int limit = 10;
        String headerDelimiter = "-------";
        for (int i = 1; i <= limit; i++) {
            System.out.printf("%3d|", i);
            headerDelimiter += "----";
        }
        System.out.println();

        System.out.println(headerDelimiter);

        for (int i = 1; i <= limit; i++) {
            System.out.printf("%4d  |", i);
            for (int j = 1; j <= limit; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
