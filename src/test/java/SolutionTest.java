import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findPeakGridTest1() {
        int[][] mat = {
                {1, 4},
                {3, 2}
        };
        int[] expected = {0, 1};
        int[] actual = new Solution().findPeakGrid(mat);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findPeakGridTest2() {
        int[][] mat = {
                {10, 20, 15},
                {21, 30, 14},
                {7, 16, 32}
        };
        int[] expected = {1, 1};
        int[] actual = new Solution().findPeakGrid(mat);

        Assert.assertEquals(expected, actual);
    }
}
