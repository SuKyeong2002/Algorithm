import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String inputStr = sc.next();
        sc.close();
        
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for (String alphabet : croatia) {
            inputStr = inputStr.replace(alphabet, "!");
        }
        
        System.out.println(inputStr.length());
    }
}