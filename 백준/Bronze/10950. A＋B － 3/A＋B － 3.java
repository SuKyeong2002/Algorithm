import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 개수를 입력 받음
        
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt(); // 첫 번째 정수 A를 입력 받음
            int B = sc.nextInt(); // 두 번째 정수 B를 입력 받음
            System.out.println(A + B); // A와 B의 합을 출력
        }

        sc.close();
    }
}
