import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 세 개의 정수를 공백으로 구분하여 입력받기
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        
        // 세 정수를 더하기
        long sum = A + B + C;
        
        // 결과 출력하기
        System.out.println(sum);
        
        sc.close();
    }
}
