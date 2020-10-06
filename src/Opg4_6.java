public class Opg4_6 {
    public static void main(String[] args) {
        final int rad = 40;
        final int centerx = 0;
        final int centery = 0;

        double angle1 = Math.toDegrees(Math.random() * (2 * Math.PI));
        double angle2 = Math.toDegrees(Math.random() * (2 * Math.PI));
        double angle3 = Math.toDegrees(Math.random() * (2 * Math.PI));

        double x = rad * Math.cos(angle1);
        double y = rad * Math.sin(angle1);
        double x2 = rad * Math.cos(angle2);
        double y2 = rad * Math.sin(angle2);
        double x3 = rad * Math.cos(angle3);
        double y3 = rad * Math.sin(angle3);
        System.out.println(x);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(y);
        System.out.println(y2);
        System.out.println(y3);


    }
}
