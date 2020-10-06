import java.util.Scanner;

public class Opg4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/6));
        System.out.println(area);
    }
}
