import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfDivisors = sc.nextInt();
        int[] divisors = new int[numberOfDivisors];
        
        // 진짜 약수들을 배열에 저장
        for (int i = 0; i < numberOfDivisors; i++) {
            divisors[i] = sc.nextInt();
        }
        
        // 진짜 약수들 중 최소값과 최대값 찾기
        int minDivisor = Integer.MAX_VALUE;
        int maxDivisor = Integer.MIN_VALUE;

        for (int i = 0; i < numberOfDivisors; i++) {
            if (divisors[i] < minDivisor) {
                minDivisor = divisors[i];
            }
            if (divisors[i] > maxDivisor) {
                maxDivisor = divisors[i];
            }
        }

        // N을 계산: N = 최소값 * 최대값
        int N = minDivisor * maxDivisor;
        
        System.out.println(N);

        sc.close();
    }
}
