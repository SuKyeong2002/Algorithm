import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        
        int distanceToLeft = x;          
        int distanceToRight = w - x;     
        int distanceToBottom = y;        
        int distanceToTop = h - y;       
        
        int minDistance = Math.min(Math.min(distanceToLeft, distanceToRight),
                                   Math.min(distanceToBottom, distanceToTop));
        
        System.out.println(minDistance);
        
        scanner.close();
    }
}
