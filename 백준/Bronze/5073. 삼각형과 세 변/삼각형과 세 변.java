import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int max = a;
            int side1 = b;
            int side2 = c;

            if (b > max) {
                max = b;
                side1 = a;
                side2 = c;
            } 
            if (c > max) {
                max = c;
                side1 = a;
                side2 = b;
            }

            if (side1 + side2 <= max) {
                System.out.println("Invalid");
            } else if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || c == a) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }

        sc.close();
    }
}
