import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        
        if ((x >= -1000) && (x <= 1000) ) {
            if (x > 0) {
                if (y > 0) {
                    System.out.print(1);
                } else {
                    System.out.print(4);
                }
            } else if (x == 0) {
                    System.out.print("0 이 아닌 x를 입력해주세요. ");
            } else if (x < 0) {
                if (y > 0) {
                    System.out.print(2);
                } else {
                    System.out.print(3);
                }
            } else {
                System.out.print("0 이 아닌 -1000 이상 1000 이하인 x를 입력해주세요. ");
            }
        }
    }
}