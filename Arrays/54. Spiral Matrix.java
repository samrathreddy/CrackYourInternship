//https://leetcode.com/problems/spiral-matrix/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int top = 0,left=0,right=matrix[0].length-1,bottom=matrix.length-1;
        while (left <= right && top <= bottom) {
            if (left <= right) {
                for (int i = left; i <= right; i++) {
                    ans.add(matrix[top][i]);
                }
                top++;
            }
            // Top to bottom
            if (top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    ans.add(matrix[i][right]);
                }
                right--;
            }
            //Right to left
            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) { 
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //Bottom to top
            if (left <= right && top <= bottom) { 
                for (int i = bottom; i >= top; i--) { 
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}