public class Circles {
    public static void main(String[] args) {
        int givenRadius = 3;
        double circleArea = Math.PI * Math.pow(givenRadius, 2);
        double length = 2 * Math.PI * givenRadius;

        int givenArea = 20;
        double radius = Math.sqrt(givenArea / Math.PI);

        double angle = 97;
        double sectorArea = Math.PI * Math.pow(radius, 2) * angle / 360;
        System.out.printf("Площадь круга = %.2f%nДлина окружности = %.2f%nРадиус окружности = %.2f%nПлощадь сектора = %.2f", circleArea, length, radius, sectorArea);
    }
}
