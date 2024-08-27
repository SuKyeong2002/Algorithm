import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] grid = new int[9][9];
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        
        int maxValue = -1; 
        int maxRow = -1;    
        int maxCol = -1;    

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] > maxValue) {
                    maxValue = grid[i][j];
                    maxRow = i + 1; 
                    maxCol = j + 1;  
                }
            }
        }
        
        System.out.println(maxValue);
        System.out.println(maxRow + " " + maxCol);
    }
}
