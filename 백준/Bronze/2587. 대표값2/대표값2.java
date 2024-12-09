import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();
        
        int sum = 0;
        int avg = 0;
        int med = 0;
        
        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        avg = sum / 5;
        System.out.println(avg);
        
        Arrays.sort(numbers);
        med = numbers[2];
        System.out.println(med);  
    }
}