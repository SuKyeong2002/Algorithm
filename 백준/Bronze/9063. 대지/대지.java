import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N == 1) {
            sc.nextInt(); 
            sc.nextInt(); 
            System.out.println(0);
            return;
        }

        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int minX = x, maxX = x;
        int minY = y, maxY = y;

        for (int i = 1; i < N; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x < minX) minX = x;
            if (x > maxX) maxX = x;
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }

        int width = maxX - minX;
        int height = maxY - minY;

        System.out.println(width * height);
    }
}
