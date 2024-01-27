class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int n_cash = n*12000;
        int k_cash = k*2000;
        int service = n/10*2000;
        
        answer = n_cash+k_cash-service;
        
        return answer;
    }
}