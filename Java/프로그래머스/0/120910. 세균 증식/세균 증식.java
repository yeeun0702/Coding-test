class Solution { 
    public int solution(int n, int t) {
        int answer = (int)Math.pow(2, t);
        return n * answer;
    }
}