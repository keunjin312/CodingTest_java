class Solution {
    public int solution(int[] numbers) {
        int length = numbers.length;
        int answer = 0;
        int multiply = 0;
        if(2<=length && length<=100)  {
            for(int i=0; i<length; i++){
                if(numbers[i]<=10000 && numbers[i]>=-10000 )
                    { for(int j=0; j<length; j++){
                       multiply = numbers[i] * numbers[j];
                        if(i != j && multiply>=answer) {
                            answer = multiply;
                            }
                        else if(length==2 && multiply<0) {
                             answer = multiply;
                            } 
                        }
                    }
                }
            }
        
        return answer;
    }
}