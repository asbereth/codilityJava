import java.util.*;

class PassingCars {
    public int solution(int[] A) {
        int N = A.length;
        int totalPassingPairs = 0;
        int pSum[] = new int[N+1];
        pSum[0] = 0;
        
        // compute prefix sum, this is 
        // to denote how many cars are 
        // travelling west (the 1's)
        for (int k = 1; k < N+1; ++k) {
            pSum[k] = pSum[k-1] + A[k-1];
        }
        
        for (int l = 0; l < N; ++l) {
            if (A[l] == 0) {
                totalPassingPairs += (pSum[N] - pSum[l]);
            }
        }
        
        totalPassingPairs = Math.abs(totalPassingPairs) > 1000000000 ? 
            -1 : totalPassingPairs;
        return totalPassingPairs;
    }
}

