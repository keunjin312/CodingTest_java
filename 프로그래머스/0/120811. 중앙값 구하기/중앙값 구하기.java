import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        
        int n = (array.length-1)/2;
        
        answer = array[n];
      
        return answer;
    }
}