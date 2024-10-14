import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sticks = new int[3];
        sticks[0] = sc.nextInt();
        sticks[1] = sc.nextInt();
        sticks[2] = sc.nextInt();

        Arrays.sort(sticks);

        if (sticks[0] + sticks[1] > sticks[2]) {
            System.out.println(sticks[0] + sticks[1] + sticks[2]);
        } else {
            System.out.println(2 * (sticks[0] + sticks[1]) - 1);
        }

        sc.close();
    }
}
