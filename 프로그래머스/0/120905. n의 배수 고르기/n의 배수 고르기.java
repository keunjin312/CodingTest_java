class Solution {
    public int[] solution(int n, int[] numlist) {
        int len = numlist.length;
        int[] list = new int[len];
        int a = 0;
        
        for(int i=0;i<len;i++) {
            if(numlist[i]%n==0) {
                list[i] = numlist[i];
                a++;
            }
            else list[i] = 0;
        }
        
        int[] answer = new int[a];
        int k =0;
        
        for(int i=0;i<len;i++) {
            if(list[i]!=0) {
                answer[k] = list[i];
                k++;
            }
            else list[i]=-1;
        }
        
        return answer;
    }
}