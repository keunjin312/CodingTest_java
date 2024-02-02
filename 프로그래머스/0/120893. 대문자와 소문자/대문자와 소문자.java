class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0;i<my_string.length();i++){
            if(64<my_string.charAt(i) && my_string.charAt(i)<91) {
                answer += (char)(my_string.charAt(i)+' ');
            }
            else if(96<my_string.charAt(i) && my_string.charAt(i)<123){
                 answer += (char)(my_string.charAt(i)-' ');
            }
        }
        
        return answer;
    }
}