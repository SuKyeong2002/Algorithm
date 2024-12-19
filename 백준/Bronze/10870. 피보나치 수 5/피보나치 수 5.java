import java.util.Scanner;

public class Main {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; 
        }
        if (n == 1) {
            return 1; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n < 0 || n > 20) {
            System.out.println("0 이상 20 이하인 숫자를 입력해주세요.");
        } else {
            System.out.println(fibonacci(n)); 
        }
    }
}
