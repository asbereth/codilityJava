import java.util.Arrays;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class PermCheck {
        
    public int solution(int[] A) {
        long sum = 0;
        long N = A.length;
        
        long actualTotalN = (N*(N+1))/2;
        
        for (int k = 0; k < N; ++k) {
            sum += A[k];
        }
        
        if (actualTotalN != sum) 
            return 0;
        
        Arrays.sort(A);
        
        for (int l = 0; l < N-1; ++l) {
            if ((A[l+1] - A[l]) != 1) {
                return 0;
            }
        }
        
        return 1;
    }
}

