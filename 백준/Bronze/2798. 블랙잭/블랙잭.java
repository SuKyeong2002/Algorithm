import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 크기가 N인 배열 생성
        int[] intArray = new int[N];
        
        // N개의 입력값 받기
        for (int i=0; i<N; i++) {
            intArray[i] = sc.nextInt();
        }
        sc.close();
        
        // 배열 오름차순으로 정렬
        Arrays.sort(intArray);
        
        // 최댓값 3개의 합을 sum 에 대입
        int maxSum = 0;
        for (int x=0; x<N-2; x++) {
            int left = x+1; // 두번째 카드
            int right = N-1; // 세번째 카드
            
           while (left < right) {
               int sum =  intArray[x] + intArray[left] + intArray[right];
               
               if (sum > M) {
                   right--;
               } else {
                   maxSum = Math.max(maxSum, sum);
                   left++;
               }
           }
        }
        
        System.out.println(maxSum);
    }
}