class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) { // 길이가 1이면 answer에 -1 저장
            return new int[]{-1};
        }

        int min = arr[0];
        int[] answer = new int[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]); // 최솟값 처리
        }

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            answer[idx++] = arr[i];
        }

        return answer;
    }
}
