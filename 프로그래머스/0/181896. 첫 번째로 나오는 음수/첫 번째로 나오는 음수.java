class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        int a = num_list.length;
        
        if(5<=a && a<=100) {
            for(int i=0;i<a;i++) {
                if(-10<=num_list[i] && num_list[i]<=100) {
                     if (num_list[i]<0) {
                        answer=i;
                        break;
                    }
                }
            }  
        }
        
        return answer;
    }
}