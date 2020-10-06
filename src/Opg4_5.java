import java.util.Scanner;

public class Opg4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sides = input.nextDouble();
        double side = input.nextDouble();
        double area = (sides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/sides));
        System.out.println(area);
    }
}
