import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
           
        int[] A = new int[n];
        for (int j = 0; j < n; j++) {
            A[j] = j;
        }
        
        // 항상 같은 값을 출력하므로 결과값까지 출력할 필요 X
        MenOfPassion(A, n);
        
        System.out.println(n);
        System.out.println(1);
    }
    
    // 항상 실행 횟수가 항상 n이고 최고차항의 차수가 1인 함수 MenOfPassion
    public static int MenOfPassion(int A[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        return sum;
    }
}