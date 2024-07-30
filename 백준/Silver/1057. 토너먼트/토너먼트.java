import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int jimin = scanner.nextInt();
        int han = scanner.nextInt();
        scanner.close();
        
        // 참가자 번호를 1부터 시작하는 값으로 설정
        int round = 1;
        int size = N;
        
        // 김지민과 임한수의 초기 위치 설정
        int jiminPos = jimin;
        int hanPos = han;
        
        // 각 라운드마다 참가자 수와 위치를 업데이트하며 대결 여부 확인
        while (size > 1) {
            // 각 참가자가 다음 라운드에서 대결하는 구역에 있는지 확인
            if ((jiminPos + 1 == hanPos && (jiminPos % 2 == 1)) || 
                (hanPos + 1 == jiminPos && (hanPos % 2 == 1))) {
                System.out.println(round);
                return;
            }
            
            // 다음 라운드로 진출하는 참가자들의 번호를 업데이트
            jiminPos = (jiminPos + 1) / 2;
            hanPos = (hanPos + 1) / 2;
            
            // 참가자 수를 반으로 줄임
            size = (size + 1) / 2;
            round++;
        }
        
        // 대결하지 않는 경우
        System.out.println(-1);
    }
}
