import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] correctCounts = {1, 1, 2, 2, 2, 8};

        int[] foundCounts = new int[6];
        for (int i = 0; i < 6; i++) {
            foundCounts[i] = scanner.nextInt();
        }

        int[] result = new int[6];
        for (int i = 0; i < 6; i++) {
            result[i] = correctCounts[i] - foundCounts[i];
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
