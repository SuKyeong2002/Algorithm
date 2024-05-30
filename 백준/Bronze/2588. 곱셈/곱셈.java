import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int B1 = B % 10;
        int B3 = B / 100;
        int B2 = (B - B1 - B3*100) / 10;
        
        int S1 = A * B1;
        int S2 = A * B2;
        int S3 = A * B3;
        
        int S = S1 + S2*10 + S3*100;
        
        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        System.out.println(S);
        
    }
}