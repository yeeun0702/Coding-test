class Solution {
    public int solution(int num, int k) {
        String strNum = String.valueOf(num);
        String strK = String.valueOf(k);
        int index = strNum.indexOf(strK) + 1;
        
        if (index == 0){
            return -1;
        } else {
            return index;
        }
        
    }
}