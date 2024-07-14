import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String reverseStr = new StringBuilder(str).reverse().toString();
        
        if(str.equals(reverseStr)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}