class Solution {
    public int[] solution(int[] num_list) {
        int a =num_list.length;
        int[] answer = new int[a];
        int k=a-1;
        
        for(int i=0;i<a;i++) {
            answer[i]=num_list[k];
            k = k-1;
        }   
        return answer;
    }
}