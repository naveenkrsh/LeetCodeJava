package array.singleNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void singleNumberTest1() {
        Solution sol = new Solution();
        int result = sol.singleNumber(new int[]{2,2,1});

        assertEquals(1,result);
    }

    @Test
    void singleNumberTest2() {
        Solution sol = new Solution();
        int result = sol.singleNumber(new int[]{4,1,2,1,2});

        assertEquals(4,result);
    }
}