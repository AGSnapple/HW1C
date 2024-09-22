import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a, b, c, d;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");

        if((a = scanner.nextFloat()) == 0)
        {
            System.out.println("Not a quadratic equation.");
            return;
        }

        System.out.print("Enter coefficient b: ");
        b = scanner.nextFloat();

        System.out.print("Enter coefficient c: ");
        c = scanner.nextFloat();

        if ((d = discriminant(a, b, c)) < 0) {
            System.out.println("No real solutions.");
            return;
        }

        if (d == 0) {
            System.out.print("There is a multiple real root of equation: ");
            System.out.print((-b) / 2 * a);
            return;
        }

        System.out.println("There are 2 roots: ");
        System.out.println((-b + Math.sqrt(d)) / (2 * a));
        System.out.println((-b - Math.sqrt(d)) / (2 * a));
    }

    public static float discriminant(float a, float b, float c) {
        return b * b - 4 * a * c;
    }
}

