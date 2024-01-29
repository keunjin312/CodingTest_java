class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int len = numbers.length;
        
        if(2<=len && len<=100){
            for(int i=0;i<len;i++){
                if(0<=numbers[i] && numbers[i]<=10000) {
                    for(int k=1; k<len;k++){
                        if(answer<numbers[i] * numbers[k] && i!=k)
                        answer = numbers[i] * numbers[k];  
                    }
                }   
            }
        }
        
        return answer;
    }
}