import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        while(n>=1){
            list.add(n%3);
            n = n/3;
        }
        int num = list.size()-1;
        for(int i=0; i<list.size(); i++){
            answer = answer + (int)(list.get(i) * Math.pow(3, num));
            num--;
        }
        return answer;
    }
}