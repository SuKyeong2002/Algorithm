import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        sc.close();
        char ch = str.charAt(0);
        int num = (int)ch;
        
        System.out.print(num);
    }
}