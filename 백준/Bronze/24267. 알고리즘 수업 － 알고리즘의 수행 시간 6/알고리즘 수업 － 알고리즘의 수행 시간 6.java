import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
       
        long count = 0;
        count = n*(n-1)*(n-2)/6;
        
        System.out.println(count);
        System.out.println(3);
    }
}
