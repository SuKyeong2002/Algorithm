import java.util.Scanner;
/* Scanner를 사용하기 위해서 import를 통해 외부 클래스를 호출하고
Scanner는 java.util 패키지에 저장되어 있음 */

public class Main{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        /* Scanner의 객체를 생성하고
        System.in을 통해 입력받은 값을 바이트 단위로 읽음 */
        
        int x = sc.nextInt(); // 변수 x의 값을 입력받음
        int y = sc.nextInt(); // 변수 y의 값을 입력받음
        
        if (x>y) // 만약 x가 y보다 큰 경우
            System.out.println(">"); // 문자 ">" 출력
        else if (x<y) // 만약 x보다 y가 큰 경우
            System.out.println("<"); // 문자 "<" 출력
        else // 그렇지 않은 경우 (즉, x와 y가 서로 같은 경우)
            System.out.println("=="); // 문자 "==" 출력
        
        sc.close(); // Scanner 닫기
    }
}