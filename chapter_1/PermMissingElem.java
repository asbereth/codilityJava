class PermMissingElem  {
    public int solution(int[] A) {
        long N = A.length;

        long actualTotal = (N+1)*(N+2)/2;
        long sum = 0;
        
        for (int k = 0; k < N; ++k) {
            sum += A[k];
        }
        
        return (int) (actualTotal - sum);
        
    }
}
