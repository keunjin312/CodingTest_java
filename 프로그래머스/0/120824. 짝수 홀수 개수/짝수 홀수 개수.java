class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        int str = num_list.length;
        int aa = 0;
        int a = 0;
        
        if(1<=str && str<=100){
            for(int i=0;i<str;i++){
                if(0<=num_list[i] && num_list[i]<=1000){
                    if(num_list[i]%2==0){
                        aa += 1;
                        answer[0] = aa;
                    }
                    else 
                        a += 1;
                        answer[1] = a;
                }
            }
        }
        
        return answer;
    }
}