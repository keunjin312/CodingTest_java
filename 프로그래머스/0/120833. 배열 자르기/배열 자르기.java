class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int a = num2-num1+1;
        int[] answer = new int[a];
        for(int i =0; num1<=num2;i++){
            answer[i]=numbers[num1];
            num1 +=1;
        }
        return answer;
    }
}