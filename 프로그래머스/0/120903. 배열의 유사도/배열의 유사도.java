class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int a = s1.length;
        int b = s2.length;
        
        for(int i=0; i<a;i++){
            for(int k=0; k<b; k++){
                if(s1[i].equals(s2[k])) {
                   answer++;
                }
            }
        }
        
        return answer;
    }
}