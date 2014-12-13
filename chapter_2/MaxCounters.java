

// you can also use imports, for example:
import java.util.Arrays;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] MaxCounters(int N, int[] A) {
        int M = A.length, currMax = 0, lastMaxCounter = 0;
        int lastIndexOfMaxCounter = -1;
        int counterSum = 0;
        int counter[] = new int[N];
        
        for (int k = M-1; k >= 0; --k) {
            if(A[k] == N+1) {
                lastIndexOfMaxCounter = k;
                break;
            }
        }
        
        if (lastIndexOfMaxCounter == -1) {
            for (int l = 0; l < M; ++l) {
                counter[A[l]-1] = counter[A[l]-1] + 1;
            }
            return counter;
        }
        
        for (int n = 0; n <= lastIndexOfMaxCounter; ++n) {
            if (A[n] == N+1) {
                lastMaxCounter = currMax;
            } else {
                counter[A[n]-1] = counter[A[n]-1] > lastMaxCounter ? 
                    counter[A[n]-1]+1 : lastMaxCounter + 1;
                currMax = 
                    counter[A[n]-1] > currMax ? 
                    counter[A[n]-1] : currMax;
            }
        }
        
        for (int o = 0; o < N; ++o) {
            counter[o] = currMax;
        }
        
        for (int p = lastIndexOfMaxCounter + 1; p < M; ++p) {
            counter[A[p]-1] = counter[A[p]-1] + 1;
        }
        
        return counter;
    }
}

