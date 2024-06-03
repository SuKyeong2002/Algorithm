import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        sc.close();
        
        if (M >= 45) {
            M -= 45;
        } else {
            M = M + 15; // M = H + 60 - 45
            if (H == 0) {
                H = 23;
            } else {
               H -= 1;
            }
        }
        System.out.print(H + " " + M);
    }
}
