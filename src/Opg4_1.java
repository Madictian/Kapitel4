import java.util.Scanner;

public class Opg4_1 {
    public static void main(String[] args) {
        System.out.println("enter radius of a pentagon: ");
        Scanner input = new Scanner(System.in);

        double radius_1 = input.nextDouble();

        double side_1 = 2 * radius_1 * Math.sin(Math.PI / 5);

        double area = (5 * Math.pow(side_1, 2)) / (4 * Math.tan(Math.PI / 5));

                System.out.printf("area = %4.2f", area);

    }
}
