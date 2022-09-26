import java.util.Scanner;
public class Pratik5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, a, area, pi = 3.14;
        System.out.print("r: ");
        r = input.nextDouble();
        System.out.print("angle: ");
        a = input.nextDouble();
        area = (pi*r*r*a)/360;
        System.out.println(area);
    }
}
