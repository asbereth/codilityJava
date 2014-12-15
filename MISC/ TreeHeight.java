// you can also use imports, for example:
import java.util.*;
import java.lang.Math;
// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class TreeHeight {
    public int solution(Tree T) {
        int leftHeight, rightHeight;
        
        if (T == null) {
            return -1;
        }
        
        return Math.max(solution(T.r), solution(T.l)) + 1;
    }
}
