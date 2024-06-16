import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] grade = new int[N];
        
        for (int i=0; i<N; i++) {
            grade[i] = sc.nextInt();
        }
        sc.close();
        
        int max = grade[0];
        for (int i=1; i<N; i++) {
            if(max < grade[i]) {
                max = grade[i];
            }
        }
        
        double sum = 0;
        for (int i=0; i<N; i++) {
            sum += (double)grade[i]/max*100;
        }
        
        double av = sum / N;
        System.out.print(av);
    }
}