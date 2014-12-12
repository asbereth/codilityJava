class Solution {
    public int solution(int X, int[] A) {
        int N = A.length;
        
        int result = -1;
        int[] counterArray = new int[X];
        
        int howManyPositions = 0;
        
        for (int k = 0; k < N; ++k) {
            if (counterArray[A[k]-1] == 0) 
                howManyPositions++;
            
            counterArray[A[k]-1] = counterArray[A[k]-1] + 1;
            if (howManyPositions == X) {
                result = k;
                break;
            }
        }
        return result;
        
    }
}
