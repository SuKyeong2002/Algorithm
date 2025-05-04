import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // map 객체 생성
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자의 이름을 map에 넣기 
        // map.put(key, value) : key 라는 이름으로 value 라는 값 저장
        // map.getOrDefault(key, 0) : key 라는 이름이 없으면 0 을 기본으로 저장
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // 완주한 참가자의 이름을 map에서 빼기
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        // 완주하지 못한 참가자의 이름을 map에서 찾기
        // map.keySet() : 저장된 key만 전부 보기
        for (String name : map.keySet()) {
            if(map.get(name) != 0) {
                return name;
            }
        }
        return "";
    }
}