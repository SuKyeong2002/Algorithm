import java.util.*;

public class Main {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
    
        int H = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        
        M += C;
        H += M / 60;
        M %= 60;
        
        if (H > 23) {
            H %= 24;
        }
            
        System.out.print(H + " " + M);
    }
}