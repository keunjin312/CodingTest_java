class Solution {
    public int[] solution(int n) {
        int len = (n+1)/2;
        int a = 0;
        int[] answer = new int[len];
        
        for(int i=0; i<=n;i++){
            if(i%2==1){
              answer[a++]=i;
            }
        }
        
        return answer;
    }
}