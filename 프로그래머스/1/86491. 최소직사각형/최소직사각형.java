import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int wmax = 0;
        int hmax = 0;
        int num = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                num = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = num;
            }
        }
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>wmax){
                wmax = sizes[i][0];
            }
            if(sizes[i][1]>hmax){
                hmax = sizes[i][1];
            }
        }
        answer= wmax * hmax;
        return answer;
    }
}