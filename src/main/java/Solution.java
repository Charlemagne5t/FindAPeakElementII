public class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m  = mat.length;
        int n = mat[0].length;

        int left = 0;
        int right = n - 1;
        int mid = left + (right - left) / 2;

        while (left <= right){
            mid = left + (right - left) / 2;
            int[] coordsMax = findMax(mid, mat);
            if(coordsMax[1] == mid){
                return coordsMax;
            }

            if(coordsMax[1] < mid){
                right = mid - 1;
            }
            if(coordsMax[1] > mid){
                left = mid + 1;
            }
        }




        return new int[]{-1, -1};
    }
    public int[] findMax(int indexJ, int[][] mat){
        int max = 0;
        int columnWithMax = - 1;
        int indexI = -1;

        for (int i = 0; i < mat.length; i++) {
            if(mat[i][indexJ] > max){
                max = mat[i][indexJ];
                columnWithMax = indexJ;
                indexI= i;
            }
        }
        if(indexJ != 0){
            for (int i = 0; i < mat.length; i++) {
                if(mat[i][indexJ - 1] > max){
                    max = mat[i][indexJ - 1];
                    columnWithMax = indexJ - 1;
                    indexI= i;
                }
            }
        }
        if(indexJ != mat[0].length - 1){
            for (int i = 0; i < mat.length; i++) {
                if(mat[i][indexJ + 1] > max){
                    max = mat[i][indexJ];
                    columnWithMax = indexJ + 1;
                    indexI= i;
                }
            }
        }

        return new int[]{indexI, columnWithMax};
    }
}