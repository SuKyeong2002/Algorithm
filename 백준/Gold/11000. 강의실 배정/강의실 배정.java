import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 수업 갯수 N값 입력 받기
        int N = sc.nextInt(); 
        
        // N개의 수업의 시작시간과 종료시간을 저장하는 정수형 2차원 배열 classes 선언
        int[][] classes = new int[N][2];
        
        // N개의 수업의 시작시간과 종료시간 입력 받기
        for (int i = 0; i < N; i++) {
            classes[i][0] = sc.nextInt();
            classes[i][1] = sc.nextInt();
        }
        sc.close();
        
        // 강의시간을 시작시간을 기준으로 오름차순 정렬
        Arrays.sort(classes, (a, b) -> Integer.compare(a[0], b[0]));
        
        // 정수형 우선순위 큐 선언
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // 첫 수업의 종료시간을 큐에 삽입
        pq.offer(classes[0][1]);
        
        // 나머지 수업 비교 (1부터 시작해야 함)
        for (int i = 1; i < N; i++) {
            
            // 이전 강의의 종료시간이 다른 강의의 시작 시간보다 이른 경우
            if (pq.peek() <= classes[i][0]) {
                
                // 기존의 pq에 삽입된 값 제거
                pq.poll();
            }
            
            // 무조건 종료시간이 삽입되어야 함
            pq.offer(classes[i][1]);
        }
        
        // 강의실의 갯수 = 큐의 크기 출력
        System.out.println(pq.size());
    }
}