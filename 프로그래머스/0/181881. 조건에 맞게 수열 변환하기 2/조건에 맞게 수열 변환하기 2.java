class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] temp = new int[arr.length]; // temp 선언

        while (true) {
            boolean changed = false;

            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];

                if (num >= 50 && num % 2 == 0) {
                    temp[i] = num / 2;
                } else if (num < 50 && num % 2 == 1) {
                    temp[i] = num * 2 + 1;
                } else {
                    temp[i] = num;
                }

                if (temp[i] != arr[i]) {
                    changed = true;
                }
            }

            if (!changed) {
                break;
            }

            System.arraycopy(temp, 0, arr, 0, arr.length);
            answer++;
        }

        return answer;
    }
}