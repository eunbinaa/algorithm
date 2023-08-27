import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int length=array.length;
        //중앙값은 홀수를 2로 나눴을 때의 몫(인덱스 0부터 시작하니까)
        int middle=length/2;
        answer=array[middle];
        return answer;
    }
}