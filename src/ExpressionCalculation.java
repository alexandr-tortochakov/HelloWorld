
public class ExpressionCalculation {
    public static void main(String[] args) {
        double x = 3 - ((56 - 12) / 44) * 4 / 2;
        double y = (2 * x) / (33 - x);
        double z = -x / (2 * y);
        System.out.printf("x = %f, y = %f, z = %f", x, y, z);
    }
}
