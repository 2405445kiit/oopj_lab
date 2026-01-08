package LAB2;
import java.util.Scanner;

class Box {
    // Data members
    double length;
    double width;
    double height;


    double volume() {
        return length * width * height;
    }
}

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Box b = new Box();


        System.out.print("Enter length: ");
        b.length = sc.nextDouble();

        System.out.print("Enter width: ");
        b.width = sc.nextDouble();

        System.out.print("Enter height: ");
        b.height = sc.nextDouble();

        // Display volume
        System.out.println("Volume = " + b.volume());
    }
}
