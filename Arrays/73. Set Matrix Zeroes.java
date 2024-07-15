//https://leetcode.com/problems/set-matrix-zeroes/
class Solution {
    public void setZeroes(int[][] matrix) {
        /*
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    //Mark rows as -1
                    for(int row = 0;row < matrix.length;row++){
                        if(matrix[row][j] != 0)   matrix[row][j] = -1;
                    }
                    //Mark columns as -1
                    for(int col = 0;col < matrix[0].length;col++){
                        if(matrix[i][col] != 0)   matrix[i][col] = -1;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == -1)  matrix[i][j] = 0;
            }
        }
        TC : O((N*M)*(N + M))+O(M*N)
        SC : O(1) 
        */

        //Better for Optimal we need to have in first row and first col as storing and extra variable
        int[] r = new int[matrix.length];
        int[] c = new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(r[i] == 1 || c[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }

        //TC : O(N*M)+O(M*N)
        //SC : O(N)+O(M) 

    }
}