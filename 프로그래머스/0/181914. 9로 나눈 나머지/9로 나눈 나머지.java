class Solution {
    public int solution(String number) {
        int sum = 0;
        for(int i = 0; i < number.length(); i++) {
            // 문자 '1' → 정수 1 로 변환
            sum += number.charAt(i) - '0';
        }
        return sum % 9;
    }
}
