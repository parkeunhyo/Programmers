import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long num = (long)Math.sqrt(n);
        if(num*num == n){
            answer = (num+1)*(num+1);
        }
        else{
            return -1;
        }
        return answer;
    }
}