class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n<=1) return nums[0];

        int dp[] = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int x=2;x<n;x++){
            dp[x] = Math.max(nums[x] + dp[x-2], dp[x-1]);
        }

        return dp[n-1];
    }
}