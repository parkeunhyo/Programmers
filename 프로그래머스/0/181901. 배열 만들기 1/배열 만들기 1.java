import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%k==0){
                answer.add(i);
            }
        }
        Collections.sort(answer);
        return answer.stream().mapToInt(i -> i).toArray();
        
    }
}