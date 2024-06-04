import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    
    int number = sc.nextInt();
    int sum = 0;
    
    for(int i=number; i>0; i--){
        sum += i;
    }
    
    System.out.print(sum);
        
    sc.close();
    }
}