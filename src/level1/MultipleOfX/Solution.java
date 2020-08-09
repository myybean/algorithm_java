package level1.MultipleOfX;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x + (i * x);
        }
        return answer;
    }

    @Test
    public void doSolution1() {
        long[] expectation = {2,4,6,8,10};
        assertArrayEquals(expectation, solution(2, 5));
    }
    @Test
    public void doSolution2() {
        long[] expectation = {4,8,12};
        assertArrayEquals(expectation, solution(4, 3));
    }
    @Test
    public void doSolution3() {
        long[] expectation = {-4,-8};
        assertArrayEquals(expectation, solution(-4, 2));
    }
}