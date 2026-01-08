import java.util.Scanner;

class Subtract {

    // Method with two integers
    void subtract(int a, int b) {
        System.out.println("Result (int, int) = " + (a - b));
    }

    // Method with three integers
    void subtract(int a, int b, int c) {
        System.out.println("Result (int, int, int) = " + (a - b - c));
    }

    // Method with two double values
    void subtract(double a, double b) {
        System.out.println("Result (double, double) = " + (a - b));
    }
}

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subtract s = new Subtract();

        // Two integers
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        s.subtract(a, b);

        // Three integers
        System.out.print("Enter three integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        s.subtract(x, y, z);

        // Two double values
        System.out.print("Enter two double values: ");
        double p = sc.nextDouble();
        double q = sc.nextDouble();
        s.subtract(p, q);
    }
}
