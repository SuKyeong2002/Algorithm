import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        int i = sc.nextInt(); 
        sc.close();
        
        String[] str = S.split("");
        System.out.print(str[i-1]);
    }
}