class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(n - 1).size();
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i ++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(triangle, 0, 0, dp);
    }
    
    int helper(List<List<Integer>> triangle, int row, int colum, int[][] dp) {
        if(row == triangle.size()) {
            return 0;
        }
        if(dp[row][colum] != -1) {
            return dp[row][colum];
        }
        int curr = triangle.get(row).get(colum);
        int left = curr + helper(triangle, row + 1, colum, dp);
        int right = curr + helper(triangle, row + 1, colum + 1, dp);
        dp[row][colum] = Math.min(left, right);
        return dp[row][colum];
    }
}
