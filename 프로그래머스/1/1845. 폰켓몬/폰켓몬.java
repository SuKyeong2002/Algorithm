import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        
        // 모든 폰켓몬의 종류를 HashSet에 넣어서 중복 제거
        for (int num : nums) {
            hash.add(num);
        }
        
        // 최대 선택 가능 수는 전체의 절반
        int maxPick = nums.length/2;
        
        // 중복 제거된 종류 개수와 maxPick 중 더 작은 값을 반환
        return Math.min(hash.size(), maxPick);
    }
}