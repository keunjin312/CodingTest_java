class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int Maxnum = 0;
        int sides_sum = 0;
        
        for(int i=0;i<3;i++){
            sides_sum += sides[i];
            if(Maxnum<sides[i]) {
                Maxnum=sides[i];
            }
        }
        
        int towside = sides_sum-Maxnum;
        
        if(Maxnum<towside){
            answer=1;
        }
        else if(Maxnum>=towside){
            answer=2;
        }
        return answer;
    }
}