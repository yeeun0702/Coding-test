class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        for (int i = 0; i < length; i++){
            if(length % 2 == 0){
            answer += s.charAt(length/2 -1);
            answer += s.charAt(length/2); break;
        }   else{
             answer += s.charAt(length/2); break;
        }
        }
       
        return answer;
    }
}