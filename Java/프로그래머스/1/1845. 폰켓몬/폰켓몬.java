import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        // 1. 모든 폰켓몬 번호를 Set에 추가 → 중복 자동 제거
        for(int i=0; i < nums.length; i++){
            set.add(nums[i]);
        }
     
        // 2. 고를 수 있는 수는 절반
        int maxPick = nums.length / 2;

        // 3. 최대 종류 수는 set.size(), 하지만 고를 수 있는 수를 넘을 순 없음
        return Math.min(set.size(), maxPick);
    }
}