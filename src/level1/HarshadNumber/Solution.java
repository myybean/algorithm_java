package level1.HarshadNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int xx = x;
        int sum = 0;
        while (xx >= 1) {
            sum += xx % 10;
            xx = xx / 10;
        }

        if (x % sum != 0) answer = false;

        return answer;
    }

    @Test
    public void doSolution1() {
        assertEquals(true, solution(10));
    }
    @Test
    public void doSolution2() {
        assertEquals(true, solution(12));
    }
    @Test
    public void doSolution3() {
        assertEquals(false, solution(11));
    }
    @Test
    public void doSolution4() {
        assertEquals(false, solution(13));
    }
}