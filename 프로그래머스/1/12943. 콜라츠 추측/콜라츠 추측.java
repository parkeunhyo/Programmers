class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        if(num==1){
            return 0;
        }
        while(n!=1){
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            answer++;
            if(answer > 500){
                return -1;
            }
        }
        return answer;
    }
}