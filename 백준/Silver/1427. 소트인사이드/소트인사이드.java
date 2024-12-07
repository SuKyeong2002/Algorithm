import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next(); 

        char[] digits = N.toCharArray();
        Arrays.sort(digits);

        for (int i = digits.length-1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}
