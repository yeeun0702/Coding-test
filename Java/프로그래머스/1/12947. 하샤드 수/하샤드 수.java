class Solution {
    public boolean solution(int x) {
        int original = x;
        
         // 정수의 각 자리 숫자 더하기
        int sum = 0;
        while(x > 0){
            sum += x % 10;    
            x /= 10;   
        }
     
        // 각 자리 숫자를 더한 수로 원래값을 나눠서 하샤드 수 판별
        //    if(original % sum == 0){
        //     answer = true;
        // } else {
        //     answer = false;
        // }
        
        // 삼항 연산자 사용
        boolean answer = original % sum == 0 ? true : false;
        return answer;
    }
}