import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }
        
        // 배열 A 오름차순 정렬
        Arrays.sort(A);
        
        // 배열 B 내림차순 정렬
        Arrays.sort(B);
        for (int i = 0; i < N / 2; i++) {
            int temp = B[i];
            B[i] = B[N - 1 - i];
            B[N - 1 - i] = temp;
        }
        
        // S의 최솟값 계산
        long S = 0;
        for (int i = 0; i < N; i++) {
            S += (long) A[i] * B[i];
        }
        
        // 결과 출력
        System.out.println(S);
        
        scanner.close();
    }
}
