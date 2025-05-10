import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        // 종류별 의상 개수 세기
        for (String[] item : clothes) {
            String type = item[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        int answer = 1;
        for (int count : map.values()) {
            // 입거나 안 입는 경우 -> (count + 1)
            answer *= (count + 1);
        }

        // 아무것도 안 입는 경우 제외
        return answer - 1;
    }
}
