import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    long n = sc.nextLong(); // int의 최대값 초과해서 long으로 변환
    long s = n * 4; 
    System.out.print(s);
    }
}