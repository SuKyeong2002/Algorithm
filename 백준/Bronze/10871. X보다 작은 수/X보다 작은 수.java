import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
        
        StringBuilder result = new StringBuilder();
        for(int i=0; i<N; i++) {
            if (A[i] < X) {
                result.append(A[i]).append(" ");
            }
        }

        System.out.print(result.toString().trim());
    }
}