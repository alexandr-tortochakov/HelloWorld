import java.util.Scanner;

public class FindingFlat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число подъездов: ");
        int inputPorchesCount = scanner.nextInt();
        System.out.print("Введите число этажей: ");
        int inputFloorsCount = scanner.nextInt();
        System.out.print("Ввведите номер квариры: ");
        int inputFlatNumber = scanner.nextInt();


        int flatsOnStaircase = 4;
        int flatsInPorch = inputFloorsCount * flatsOnStaircase;
        int allFlats = flatsInPorch * inputPorchesCount;

        if (inputFlatNumber > allFlats) {
            System.out.print("Квартиры с таким номером в доме нет");
        } else {
            int porch = (inputFlatNumber - 1) / flatsInPorch + 1;
            int floor = (inputFlatNumber - 1) / flatsOnStaircase - (porch - 1) * inputFloorsCount + 1;

            if (inputFlatNumber % flatsOnStaircase == 0) {
                System.out.printf("Ваша квартира ближняя справа на лестничной площадке и находится на %d этаже %d-го подъезда", floor, porch);
            } else if (inputFlatNumber % flatsOnStaircase == 1) {
                System.out.printf("Ваша квартира ближняя слева на лестничной площадке и находится на на %d этаже %d-го подъезда", floor, porch);
            } else if (inputFlatNumber % flatsOnStaircase == 2) {
                System.out.printf("Ваша квартира дальняя слева на лестничной площадке и находится на на %d этаже %d-го подъезда", floor, porch);
            } else {
                System.out.printf("Ваша квартира дальняя справа на лестничной площадке и находится на на %d этаже %d-го подъезда", floor, porch);
            }
        }
    }
}
