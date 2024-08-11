import java.util.*;

public class Main {

    // 두 수의 최대공약수 계산
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 두 수의 최소공배수 계산
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    // 주어진 배열에서 최소 공배수를 찾는 함수
    public static int findMinLcm(int[] numbers) {
        int minLcm = Integer.MAX_VALUE;

        // 모든 조합을 확인
        for (int i = 0; i < (1 << 5); i++) {
            int count = Integer.bitCount(i);
            if (count < 3) continue;

            int lcmValue = 1;
            boolean valid = true;
            for (int j = 0; j < 5; j++) {
                if ((i & (1 << j)) != 0) {
                    lcmValue = lcm(lcmValue, numbers[j]);
                    if (lcmValue >= minLcm) {
                        valid = false;
                        break;
                    }
                }
            }
            if (valid) {
                minLcm = Math.min(minLcm, lcmValue);
            }
        }

        return minLcm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int result = findMinLcm(numbers);
        System.out.println(result);
    }
}
