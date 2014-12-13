// you can also use imports, for example:
import java.util.Arrays;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        long numberToReturn = 1;
        
        if (N == 1) return Math.max(1, A[0] + 1);
        Arrays.sort(A);
        if (A[N-1] <= 0) return 1;
        
        hereBeDragons: {
            for (int l = 0; l < N; ++l) {
                if (A[l] == 1) {
                    break hereBeDragons;            
                }
            }
            return 1;
        }
        
        for (int k = 0; k < N; ++k) {
            if (A[k] < 0) A[k] = 0;
        }
        
        finalLoops: {
            for (int m = 0; m < N-1; ++m) {
                if ((A[m+1] - A[m]) > 1) {
                    numberToReturn = A[m] + 1;
                    break finalLoops;
                }
            }
            return A[N-1] + 1;
        }
        
        return (int)numberToReturn;
    }
}
