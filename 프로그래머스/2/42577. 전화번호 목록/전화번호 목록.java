import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        // 1. 전화번호 배열을 정렬 
        Arrays.sort(phone_book);
        
        // 2. 인접한 번호끼리 접두어인지 확인
        for(int i = 0; i < phone_book.length-1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}