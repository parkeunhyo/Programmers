class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int num = 0;
        
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        int a = num_list[num_list.length-1];
        int b = num_list[num_list.length-2];
        answer[answer.length-1] = a>b ? a-b : a*2;
        return answer;
    }
}