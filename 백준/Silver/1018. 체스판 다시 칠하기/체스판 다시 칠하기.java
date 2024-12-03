import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = sc.next().toCharArray();
        }

        int minRepaint = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int repaint = Math.min(countRepaint(board, i, j, 'W'),
                                       countRepaint(board, i, j, 'B'));
                minRepaint = Math.min(minRepaint, repaint);
            }
        }

        System.out.println(minRepaint);
    }

    private static int countRepaint(char[][] board, int x, int y, char startColor) {
        int repaintCount = 0;
        char currentColor = startColor;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[x + i][y + j] != currentColor) {
                    repaintCount++;
                }
                currentColor = (currentColor == 'W') ? 'B' : 'W';
            }
            currentColor = (currentColor == 'W') ? 'B' : 'W';
        }

        return repaintCount;
    }
}
