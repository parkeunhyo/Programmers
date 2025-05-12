class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int num = 0;
        int a = num_list.length;
        if (num_list[a - 1] > num_list[a - 2]) {
            num = num_list[a - 1] - num_list[a - 2];
        } else {
            num = num_list[a - 1] * 2;
        }
        System.out.println(num);
        answer = new int[a+1];
        for(int i=0; i<answer.length; i++){
            if(i==answer.length-1){
                answer[i]=num;
            }else{
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}