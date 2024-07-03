import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N: 바구니의 개수, M: 역순으로 바꿀 횟수
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 초기 바구니 배열 생성
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        // M번 순서 역순 변경
        for (int m = 0; m < M; m++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            reverse(baskets, i - 1, j - 1);
        }

        // 결과 출력
        for (int basket : baskets) {
            System.out.print(basket + " ");
        }
    }

    // 배열의 부분을 역순으로 바꾸는 함수
    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
