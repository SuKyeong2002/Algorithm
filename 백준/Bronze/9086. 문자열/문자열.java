import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();  // 개행 문자 소모
        
        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            System.out.println("" + firstChar + lastChar);
        }
        
        sc.close();
    }
}
