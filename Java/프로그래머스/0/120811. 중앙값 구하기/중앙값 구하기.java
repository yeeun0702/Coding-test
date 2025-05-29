import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int n = array.length/2;
        return array[n];
    }
}