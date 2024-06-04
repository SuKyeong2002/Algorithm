import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int F = sc.nextInt();
        int S = sc.nextInt();
        int T = sc.nextInt();
        sc.close();
        
        if ((F == S) || (S == T) || (T == F)) {
            if ((F == S) && (S == T)) {
                System.out.print(10000 + F * 1000);
            } else {
                if (F == S) {
                    System.out.print(1000 + F * 100);
                } else if (S == T) {
                    System.out.print(1000 + S * 100);
                } else {
                    System.out.print(1000 + T * 100);
                }
            }
        } else {
            if (((F > S ) && (S > T)) || ((F > T) && (T > S))) {
                System.out.print(F * 100);
            } else if (((S > F) && (F > T)) || ((S > T) && (T > F))) {
                System.out.print(S * 100);
            } else {
                System.out.print(T * 100);
            }
        }
    }
}