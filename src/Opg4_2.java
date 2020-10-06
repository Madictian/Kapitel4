import java.util.Scanner;

public class Opg4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x.1: ");
        double point_1_x = Math.toRadians(input.nextDouble());
        System.out.print("y.1: ");
        double point_1_y = Math.toRadians(input.nextDouble());
        System.out.print("x.2: ");
        double point_2_x = Math.toRadians(input.nextDouble());
        System.out.print("y.2: ");
        double point_2_y = Math.toRadians(input.nextDouble());
        System.out.print("x.1: " + point_1_x + "\ny.1: " + point_1_y + "\nx.2: " + point_2_x + "\ny.2: " + point_2_y);


        double radius_2 = 6371.01;

        double distance = radius_2 * Math.acos(Math.sin(point_1_x) * Math.sin(point_2_x) + Math.cos(point_1_x) * Math.cos(point_2_x) * Math.cos(point_1_y - point_2_y));
        System.out.print("\n" + distance);
     }
}
