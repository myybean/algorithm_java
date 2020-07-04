package level1.DescendIntegers;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        ArrayList list = new ArrayList();

        while (n >= 1) {
            list.add(n % 10);
            n = n / 10;
        }

        Collections.sort(list, Collections.reverseOrder());

        StringBuffer temp = new StringBuffer();
        list.forEach((l) -> temp.append(l));
        answer = Long.parseLong(temp.toString());

        return answer;
    }

    @Test
    public void doSolution() {
        assertEquals(873211, solution(118372));
    }
}