import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashSet<Integer> remainders = new HashSet<>();
        
        for(int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            int remainder = number % 42;
            remainders.add(remainder);
        }
        sc.close();
        
        System.out.print(remainders.size());
    }
}
