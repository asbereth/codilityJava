class TapeEquilibrium {
    public int solution(int[] A) {
        int N = A.length;
        
        long sum = 0;
        long currentLower = 0, currentUpper = 0, 
            currentMin = 0;
        
        for (int k = 0; k < N; ++k) {
            sum += A[k];
        }
        int[ ] diffArray = new int[N-1];
        
        for (int P = 1; P < N; ++P) {
            currentUpper += A[P-1];
            currentLower = sum - currentUpper;
            diffArray[P-1] = Math.abs((int)(currentUpper - currentLower));
            if (P == 1)
                currentMin = diffArray[P-1];
            else 
                if (currentMin > diffArray[P-1]) 
                    currentMin = diffArray[P-1];
        }
        
        return (int)currentMin;
    }
}
