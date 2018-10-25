import java.util.Scanner;

public class SimpleEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This simple equation is ax + b = c");
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        double x = (c-b)/a;
        System.out.println("x = " + x);

    }
}
