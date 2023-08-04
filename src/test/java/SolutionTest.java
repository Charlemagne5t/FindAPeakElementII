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

        Assert.assertArrayEquals(expected, actual);
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

        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void findPeakGridTest3() {
        int[][] mat = {
                {41, 8, 2, 48, 18},
                {16, 15, 9, 7, 44},
                {48, 35, 6, 38, 28},
                {3, 2, 14, 15, 33},
                {39, 36, 13, 46, 42}

        };
        int[] expected = {0, 3};
        int[] actual = new Solution().findPeakGrid(mat);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findPeakGridTest4() {
        int[][] mat = {
                {10,50,40,30,20},
                {1,500,2,3,4}

        };
        int[] expected = {1, 1};
        int[] actual = new Solution().findPeakGrid(mat);

        Assert.assertArrayEquals(expected, actual);
    }
}
